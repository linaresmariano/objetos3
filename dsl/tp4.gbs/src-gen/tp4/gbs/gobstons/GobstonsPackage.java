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
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.DomainmodelImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getDomainmodel()
   * @generated
   */
  int DOMAINMODEL = 0;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__IMPORT_SECTION = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.AbstractElementImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.PackageDeclarationImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.EntityImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.FeatureImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.PropertyImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = FEATURE__TYPE;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link tp4.gbs.gobstons.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tp4.gbs.gobstons.impl.OperationImpl
   * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__TYPE = FEATURE__TYPE;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARAMS = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__BODY = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link tp4.gbs.gobstons.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see tp4.gbs.gobstons.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the containment reference '{@link tp4.gbs.gobstons.Domainmodel#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see tp4.gbs.gobstons.Domainmodel#getImportSection()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_ImportSection();

  /**
   * Returns the meta object for the containment reference list '{@link tp4.gbs.gobstons.Domainmodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see tp4.gbs.gobstons.Domainmodel#getElements()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Elements();

  /**
   * Returns the meta object for class '{@link tp4.gbs.gobstons.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see tp4.gbs.gobstons.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for the attribute '{@link tp4.gbs.gobstons.AbstractElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tp4.gbs.gobstons.AbstractElement#getName()
   * @see #getAbstractElement()
   * @generated
   */
  EAttribute getAbstractElement_Name();

  /**
   * Returns the meta object for class '{@link tp4.gbs.gobstons.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see tp4.gbs.gobstons.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link tp4.gbs.gobstons.PackageDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see tp4.gbs.gobstons.PackageDeclaration#getElements()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link tp4.gbs.gobstons.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see tp4.gbs.gobstons.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference '{@link tp4.gbs.gobstons.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see tp4.gbs.gobstons.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link tp4.gbs.gobstons.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see tp4.gbs.gobstons.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Features();

  /**
   * Returns the meta object for class '{@link tp4.gbs.gobstons.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see tp4.gbs.gobstons.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link tp4.gbs.gobstons.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tp4.gbs.gobstons.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the containment reference '{@link tp4.gbs.gobstons.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see tp4.gbs.gobstons.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Type();

  /**
   * Returns the meta object for class '{@link tp4.gbs.gobstons.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see tp4.gbs.gobstons.Property
   * @generated
   */
  EClass getProperty();

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
   * Returns the meta object for the containment reference list '{@link tp4.gbs.gobstons.Operation#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see tp4.gbs.gobstons.Operation#getParams()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Params();

  /**
   * Returns the meta object for the containment reference '{@link tp4.gbs.gobstons.Operation#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see tp4.gbs.gobstons.Operation#getBody()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Body();

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
     * The meta object literal for the '{@link tp4.gbs.gobstons.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp4.gbs.gobstons.impl.DomainmodelImpl
     * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getDomainmodel()
     * @generated
     */
    EClass DOMAINMODEL = eINSTANCE.getDomainmodel();

    /**
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__IMPORT_SECTION = eINSTANCE.getDomainmodel_ImportSection();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__ELEMENTS = eINSTANCE.getDomainmodel_Elements();

    /**
     * The meta object literal for the '{@link tp4.gbs.gobstons.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp4.gbs.gobstons.impl.AbstractElementImpl
     * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ELEMENT__NAME = eINSTANCE.getAbstractElement_Name();

    /**
     * The meta object literal for the '{@link tp4.gbs.gobstons.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp4.gbs.gobstons.impl.PackageDeclarationImpl
     * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__ELEMENTS = eINSTANCE.getPackageDeclaration_Elements();

    /**
     * The meta object literal for the '{@link tp4.gbs.gobstons.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp4.gbs.gobstons.impl.EntityImpl
     * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

    /**
     * The meta object literal for the '{@link tp4.gbs.gobstons.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp4.gbs.gobstons.impl.FeatureImpl
     * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

    /**
     * The meta object literal for the '{@link tp4.gbs.gobstons.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tp4.gbs.gobstons.impl.PropertyImpl
     * @see tp4.gbs.gobstons.impl.GobstonsPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

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
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__PARAMS = eINSTANCE.getOperation_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__BODY = eINSTANCE.getOperation_Body();

  }

} //GobstonsPackage
