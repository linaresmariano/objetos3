/**
 */
package tp4.gbs.gobstons;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp4.gbs.gobstons.Conditional#getBoolExpresion <em>Bool Expresion</em>}</li>
 *   <li>{@link tp4.gbs.gobstons.Conditional#getTrueBlock <em>True Block</em>}</li>
 *   <li>{@link tp4.gbs.gobstons.Conditional#getFalseBlock <em>False Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp4.gbs.gobstons.GobstonsPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends Operation
{
  /**
   * Returns the value of the '<em><b>Bool Expresion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool Expresion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool Expresion</em>' containment reference.
   * @see #setBoolExpresion(HayBolitas)
   * @see tp4.gbs.gobstons.GobstonsPackage#getConditional_BoolExpresion()
   * @model containment="true"
   * @generated
   */
  HayBolitas getBoolExpresion();

  /**
   * Sets the value of the '{@link tp4.gbs.gobstons.Conditional#getBoolExpresion <em>Bool Expresion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool Expresion</em>' containment reference.
   * @see #getBoolExpresion()
   * @generated
   */
  void setBoolExpresion(HayBolitas value);

  /**
   * Returns the value of the '<em><b>True Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True Block</em>' containment reference.
   * @see #setTrueBlock(Operation)
   * @see tp4.gbs.gobstons.GobstonsPackage#getConditional_TrueBlock()
   * @model containment="true"
   * @generated
   */
  Operation getTrueBlock();

  /**
   * Sets the value of the '{@link tp4.gbs.gobstons.Conditional#getTrueBlock <em>True Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True Block</em>' containment reference.
   * @see #getTrueBlock()
   * @generated
   */
  void setTrueBlock(Operation value);

  /**
   * Returns the value of the '<em><b>False Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False Block</em>' containment reference.
   * @see #setFalseBlock(Operation)
   * @see tp4.gbs.gobstons.GobstonsPackage#getConditional_FalseBlock()
   * @model containment="true"
   * @generated
   */
  Operation getFalseBlock();

  /**
   * Sets the value of the '{@link tp4.gbs.gobstons.Conditional#getFalseBlock <em>False Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False Block</em>' containment reference.
   * @see #getFalseBlock()
   * @generated
   */
  void setFalseBlock(Operation value);

} // Conditional
