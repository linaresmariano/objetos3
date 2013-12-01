/**
 */
package tp4.gbs.gobstons;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp4.gbs.gobstons.ProcedureDeclaration#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp4.gbs.gobstons.GobstonsPackage#getProcedureDeclaration()
 * @model
 * @generated
 */
public interface ProcedureDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link tp4.gbs.gobstons.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see tp4.gbs.gobstons.GobstonsPackage#getProcedureDeclaration_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

} // ProcedureDeclaration
