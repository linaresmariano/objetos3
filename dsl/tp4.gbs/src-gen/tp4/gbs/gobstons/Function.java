/**
 */
package tp4.gbs.gobstons;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp4.gbs.gobstons.Function#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp4.gbs.gobstons.GobstonsPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Operation
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' attribute.
   * @see #setParam(String)
   * @see tp4.gbs.gobstons.GobstonsPackage#getFunction_Param()
   * @model
   * @generated
   */
  String getParam();

  /**
   * Sets the value of the '{@link tp4.gbs.gobstons.Function#getParam <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' attribute.
   * @see #getParam()
   * @generated
   */
  void setParam(String value);

} // Function
