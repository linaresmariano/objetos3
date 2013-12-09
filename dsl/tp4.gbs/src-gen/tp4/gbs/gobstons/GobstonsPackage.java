/**
 */
package tp4.gbs.gobstons;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tp4.gbs.gobstons.GobstonsFactory
 * @model kind="package"
 * @generated
 */
public interface GobstonsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gobstons";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.gbs.tp4/Gobstons";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gobstons";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GobstonsPackage eINSTANCE = tp4.gbs.gobstons.impl.GobstonsPackageImpl.init();

  /**
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.ProcedureDeclarationImpl <em>Procedure Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.ProcedureDeclarationImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getProcedureDeclaration()
   * @generated
   */
  int PROCEDURE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECLARATION__OPERATIONS = 0;

  /**
   * The number of structural features of the '<em>Procedure Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.OperationImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 1;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.FunctionImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 2;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAM = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.ConditionalImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 3;

  /**
   * The feature id for the '<em><b>Bool Expresion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__BOOL_EXPRESION = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>True Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__TRUE_BLOCK = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>False Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__FALSE_BLOCK = OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.HayBolitasImpl <em>Hay Bolitas</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.HayBolitasImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getHayBolitas()
   * @generated
   */
  int HAY_BOLITAS = 4;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAY_BOLITAS__PARAM = FUNCTION__PARAM;

  /**
   * The number of structural features of the '<em>Hay Bolitas</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAY_BOLITAS_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.MoverImpl <em>Mover</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.MoverImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getMover()
   * @generated
   */
  int MOVER = 5;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER__PARAM = FUNCTION__PARAM;

  /**
   * The number of structural features of the '<em>Mover</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.PonerImpl <em>Poner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.PonerImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getPoner()
   * @generated
   */
  int PONER = 6;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PONER__PARAM = FUNCTION__PARAM;

  /**
   * The number of structural features of the '<em>Poner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PONER_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link tp4.gbs.gobstons.ProcedureDeclaration <em>Procedure Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Declaration</em>'.
   * @see tp4.gbs.gobstons.ProcedureDeclaration
   * @generated
   */
  EClass getProcedureDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link tp4.gbs.gobstons.ProcedureDeclaration#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see tp4.gbs.gobstons.ProcedureDeclaration#getOperations()
   * @see #getProcedureDeclaration()
   * @generated
   */
  EReference getProcedureDeclaration_Operations();

  /**
   * Returns the meta object for class '{@link tp4.gbs.gobstons.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see tp4.gbs.gobstons.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for class '{@link tp4.gbs.gobstons.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see tp4.gbs.gobstons.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link tp4.gbs.gobstons.Function#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Param</em>'.
   * @see tp4.gbs.gobstons.Function#getParam()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Param();

  /**
   * Returns the meta object for class '{@link tp4.gbs.gobstons.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional</em>'.
   * @see tp4.gbs.gobstons.Conditional
   * @generated
   */
  EClass getConditional();

  /**
   * Returns the meta object for the containment reference '{@link tp4.gbs.gobstons.Conditional#getBoolExpresion <em>Bool Expresion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bool Expresion</em>'.
   * @see tp4.gbs.gobstons.Conditional#getBoolExpresion()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_BoolExpresion();

  /**
   * Returns the meta object for the containment reference '{@link tp4.gbs.gobstons.Conditional#getTrueBlock <em>True Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>True Block</em>'.
   * @see tp4.gbs.gobstons.Conditional#getTrueBlock()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_TrueBlock();

  /**
   * Returns the meta object for the containment reference '{@link tp4.gbs.gobstons.Conditional#getFalseBlock <em>False Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>False Block</em>'.
   * @see tp4.gbs.gobstons.Conditional#getFalseBlock()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_FalseBlock();

  /**
   * Returns the meta object for class '{@link tp4.gbs.gobstons.HayBolitas <em>Hay Bolitas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hay Bolitas</em>'.
   * @see tp4.gbs.gobstons.HayBolitas
   * @generated
   */
  EClass getHayBolitas();

  /**
   * Returns the meta object for class '{@link tp4.gbs.gobstons.Mover <em>Mover</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mover</em>'.
   * @see tp4.gbs.gobstons.Mover
   * @generated
   */
  EClass getMover();

  /**
   * Returns the meta object for class '{@link tp4.gbs.gobstons.Poner <em>Poner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poner</em>'.
   * @see tp4.gbs.gobstons.Poner
   * @generated
   */
  EClass getPoner();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GobstonsFactory getGobstonsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link tp4.gbs.gobstons.impl.ProcedureDeclarationImpl <em>Procedure Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp4.gbs.gobstons.impl.ProcedureDeclarationImpl
     * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getProcedureDeclaration()
     * @generated
     */
    EClass PROCEDURE_DECLARATION = eINSTANCE.getProcedureDeclaration();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_DECLARATION__OPERATIONS = eINSTANCE.getProcedureDeclaration_Operations();

    /**
     * The meta object literal for the '{@link tp4.gbs.gobstons.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp4.gbs.gobstons.impl.OperationImpl
     * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '{@link tp4.gbs.gobstons.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp4.gbs.gobstons.impl.FunctionImpl
     * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__PARAM = eINSTANCE.getFunction_Param();

    /**
     * The meta object literal for the '{@link tp4.gbs.gobstons.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp4.gbs.gobstons.impl.ConditionalImpl
     * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getConditional()
     * @generated
     */
    EClass CONDITIONAL = eINSTANCE.getConditional();

    /**
     * The meta object literal for the '<em><b>Bool Expresion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__BOOL_EXPRESION = eINSTANCE.getConditional_BoolExpresion();

    /**
     * The meta object literal for the '<em><b>True Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__TRUE_BLOCK = eINSTANCE.getConditional_TrueBlock();

    /**
     * The meta object literal for the '<em><b>False Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__FALSE_BLOCK = eINSTANCE.getConditional_FalseBlock();

    /**
     * The meta object literal for the '{@link tp4.gbs.gobstons.impl.HayBolitasImpl <em>Hay Bolitas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp4.gbs.gobstons.impl.HayBolitasImpl
     * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getHayBolitas()
     * @generated
     */
    EClass HAY_BOLITAS = eINSTANCE.getHayBolitas();

    /**
     * The meta object literal for the '{@link tp4.gbs.gobstons.impl.MoverImpl <em>Mover</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp4.gbs.gobstons.impl.MoverImpl
     * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getMover()
     * @generated
     */
    EClass MOVER = eINSTANCE.getMover();

    /**
     * The meta object literal for the '{@link tp4.gbs.gobstons.impl.PonerImpl <em>Poner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp4.gbs.gobstons.impl.PonerImpl
     * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getPoner()
     * @generated
     */
    EClass PONER = eINSTANCE.getPoner();

  }

} //GobstonsPackage
