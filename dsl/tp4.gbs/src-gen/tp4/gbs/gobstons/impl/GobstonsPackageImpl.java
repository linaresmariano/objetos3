/**
 */
package tp4.gbs.gobstons.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tp4.gbs.gobstons.GobstonsFactory;
import tp4.gbs.gobstons.GobstonsPackage;
import tp4.gbs.gobstons.HayBolitas;
import tp4.gbs.gobstons.Mover;
import tp4.gbs.gobstons.Operation;
import tp4.gbs.gobstons.Poner;
import tp4.gbs.gobstons.ProcedureDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GobstonsPackageImpl extends EPackageImpl implements GobstonsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hayBolitasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ponerEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see tp4.gbs.gobstons.GobstonsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GobstonsPackageImpl()
  {
    super(eNS_URI, GobstonsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GobstonsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GobstonsPackage init()
  {
    if (isInited) return (GobstonsPackage)EPackage.Registry.INSTANCE.getEPackage(GobstonsPackage.eNS_URI);

    // Obtain or create and register package
    GobstonsPackageImpl theGobstonsPackage = (GobstonsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GobstonsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GobstonsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGobstonsPackage.createPackageContents();

    // Initialize created meta-data
    theGobstonsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGobstonsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GobstonsPackage.eNS_URI, theGobstonsPackage);
    return theGobstonsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureDeclaration()
  {
    return procedureDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureDeclaration_Operations()
  {
    return (EReference)procedureDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Param()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHayBolitas()
  {
    return hayBolitasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMover()
  {
    return moverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoner()
  {
    return ponerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GobstonsFactory getGobstonsFactory()
  {
    return (GobstonsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    procedureDeclarationEClass = createEClass(PROCEDURE_DECLARATION);
    createEReference(procedureDeclarationEClass, PROCEDURE_DECLARATION__OPERATIONS);

    operationEClass = createEClass(OPERATION);
    createEAttribute(operationEClass, OPERATION__PARAM);

    hayBolitasEClass = createEClass(HAY_BOLITAS);

    moverEClass = createEClass(MOVER);

    ponerEClass = createEClass(PONER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    hayBolitasEClass.getESuperTypes().add(this.getOperation());
    moverEClass.getESuperTypes().add(this.getOperation());
    ponerEClass.getESuperTypes().add(this.getOperation());

    // Initialize classes and features; add operations and parameters
    initEClass(procedureDeclarationEClass, ProcedureDeclaration.class, "ProcedureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcedureDeclaration_Operations(), this.getOperation(), null, "operations", null, 0, -1, ProcedureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperation_Param(), ecorePackage.getEString(), "param", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hayBolitasEClass, HayBolitas.class, "HayBolitas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(moverEClass, Mover.class, "Mover", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ponerEClass, Poner.class, "Poner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //GobstonsPackageImpl
