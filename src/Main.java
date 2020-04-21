import ast.errorHandler.ErrorHandler;
import parser.*;

import org.antlr.v4.runtime.*;

import java.io.PrintStream;
import ast.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import visitor.codeGenerator.ExecuteCGVisitor;
import visitor.codeGenerator.OffsetVisitor;
import visitor.semantic.TypeCheckingVisitor;
import visitor.semantic.VisitorIdentification;

public class Main {

	public static void main(String... args) throws Exception {
		if (args.length<1) {
			System.err.println("Please, pass me the input file.");
			return;
		}

		// create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		PmmLexer lexer = new PmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PmmParser parser = new PmmParser(tokens);
		Program ast = parser.program().ast;

		ast.accept(new VisitorIdentification(), null);
		ast.accept(new TypeCheckingVisitor(), null);
		// * Check errors
		if(ErrorHandler.getInstance().hasErrors()){
			// * Show errors
			ErrorHandler.getInstance().showErrors(new PrintStream(System.err));
		}
		else{
			ast.accept(new OffsetVisitor(), null);
			// * The AST is shown
			IntrospectorModel model=new IntrospectorModel("Program", ast);
			new IntrospectorTree("Introspector", model);
			ast.accept(new ExecuteCGVisitor("input.txt","output.txt"),null);
		}
	}
}