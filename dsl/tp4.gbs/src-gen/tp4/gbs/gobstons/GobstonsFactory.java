/**
 */
package tp4.gbs.gobstons;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tp4.gbs.gobstons.GobstonsPackage
 * @generated
 */
public interface GobstonsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GobstonsFactory eINSTANCE = tp4.gbs.gobstons.impl.GobstonsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Procedure Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Declaration</em>'.
   * @generated
   */
  ProcedureDeclaration createProcedureDeclaration();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Hay Bolitas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hay Bolitas</em>'.
   * @generated
   */
  HayBolitas createHayBolitas();

  /**
   * Returns a new object of class '<em>Mover</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mover</em>'.
   * @generated
   */
  Mover createMover();

  /**
   * Returns a new object of class '<em>Poner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Poner</em>'.
   * @generated
   */
  Poner createPoner();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GobstonsPackage getGobstonsPackage();

} //GobstonsFactory
