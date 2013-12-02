package tp4.gbs.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import tp4.gbs.gobstons.Operation;
import tp4.gbs.gobstons.ProcedureDeclaration;

@SuppressWarnings("all")
public class GobstonsGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<ProcedureDeclaration> _filter = Iterables.<ProcedureDeclaration>filter(_iterable, ProcedureDeclaration.class);
    for (final ProcedureDeclaration e : _filter) {
      CharSequence _compile = this.compile(e);
      fsa.generateFile("Main.java", _compile);
    }
  }
  
  public CharSequence compile(final Operation op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("tablero.");
    Class<? extends Operation> _class = op.getClass();
    String _simpleName = _class.getSimpleName();
    String _lowerCase = _simpleName.toLowerCase();
    Class<? extends Operation> _class_1 = op.getClass();
    String _simpleName_1 = _class_1.getSimpleName();
    int _length = _simpleName_1.length();
    int _minus = (_length - 4);
    String _substring = _lowerCase.substring(0, _minus);
    _builder.append(_substring, "");
    _builder.append("(\"");
    String _param = op.getParam();
    _builder.append(_param, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final ProcedureDeclaration f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import main.java.Tablero;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Main {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("Tablero tablero = new Tablero();");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("tablero.print();");
    _builder.newLine();
    {
      EList<Operation> _operations = f.getOperations();
      for(final Operation operation : _operations) {
        _builder.append("\t \t");
        CharSequence _compile = this.compile(operation);
        _builder.append(_compile, "	 	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t \t");
    _builder.append("tablero.print();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
