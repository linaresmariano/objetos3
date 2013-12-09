/**
 */
package tp4.gbs.gobstons.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tp4.gbs.gobstons.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GobstonsFactoryImpl extends EFactoryImpl implements GobstonsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GobstonsFactory init()
  {
    try
    {
      GobstonsFactory theGobstonsFactory = (GobstonsFactory)EPackage.Registry.INSTANCE.getEFactory(GobstonsPackage.eNS_URI);
      if (theGobstonsFactory != null)
      {
        return theGobstonsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GobstonsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GobstonsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GobstonsPackage.PROCEDURE_DECLARATION: return createProcedureDeclaration();
      case GobstonsPackage.OPERATION: return createOperation();
      case GobstonsPackage.FUNCTION: return createFunction();
      case GobstonsPackage.CONDITIONAL: return createConditional();
      case GobstonsPackage.HAY_BOLITAS: return createHayBolitas();
      case GobstonsPackage.MOVER: return createMover();
      case GobstonsPackage.PONER: return createPoner();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureDeclaration createProcedureDeclaration()
  {
    ProcedureDeclarationImpl procedureDeclaration = new ProcedureDeclarationImpl();
    return procedureDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conditional createConditional()
  {
    ConditionalImpl conditional = new ConditionalImpl();
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HayBolitas createHayBolitas()
  {
    HayBolitasImpl hayBolitas = new HayBolitasImpl();
    return hayBolitas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mover createMover()
  {
    MoverImpl mover = new MoverImpl();
    return mover;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Poner createPoner()
  {
    PonerImpl poner = new PonerImpl();
    return poner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GobstonsPackage getGobstonsPackage()
  {
    return (GobstonsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GobstonsPackage getPackage()
  {
    return GobstonsPackage.eINSTANCE;
  }

} //GobstonsFactoryImpl
