/**
 */
package tp4.gbs.gobstons.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tp4.gbs.gobstons.Conditional;
import tp4.gbs.gobstons.GobstonsPackage;
import tp4.gbs.gobstons.HayBolitas;
import tp4.gbs.gobstons.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp4.gbs.gobstons.impl.ConditionalImpl#getBoolExpresion <em>Bool Expresion</em>}</li>
 *   <li>{@link tp4.gbs.gobstons.impl.ConditionalImpl#getTrueBlock <em>True Block</em>}</li>
 *   <li>{@link tp4.gbs.gobstons.impl.ConditionalImpl#getFalseBlock <em>False Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends OperationImpl implements Conditional
{
  /**
   * The cached value of the '{@link #getBoolExpresion() <em>Bool Expresion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolExpresion()
   * @generated
   * @ordered
   */
  protected HayBolitas boolExpresion;

  /**
   * The cached value of the '{@link #getTrueBlock() <em>True Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrueBlock()
   * @generated
   * @ordered
   */
  protected Operation trueBlock;

  /**
   * The cached value of the '{@link #getFalseBlock() <em>False Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalseBlock()
   * @generated
   * @ordered
   */
  protected Operation falseBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GobstonsPackage.Literals.CONDITIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HayBolitas getBoolExpresion()
  {
    return boolExpresion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoolExpresion(HayBolitas newBoolExpresion, NotificationChain msgs)
  {
    HayBolitas oldBoolExpresion = boolExpresion;
    boolExpresion = newBoolExpresion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GobstonsPackage.CONDITIONAL__BOOL_EXPRESION, oldBoolExpresion, newBoolExpresion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoolExpresion(HayBolitas newBoolExpresion)
  {
    if (newBoolExpresion != boolExpresion)
    {
      NotificationChain msgs = null;
      if (boolExpresion != null)
        msgs = ((InternalEObject)boolExpresion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GobstonsPackage.CONDITIONAL__BOOL_EXPRESION, null, msgs);
      if (newBoolExpresion != null)
        msgs = ((InternalEObject)newBoolExpresion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GobstonsPackage.CONDITIONAL__BOOL_EXPRESION, null, msgs);
      msgs = basicSetBoolExpresion(newBoolExpresion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GobstonsPackage.CONDITIONAL__BOOL_EXPRESION, newBoolExpresion, newBoolExpresion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getTrueBlock()
  {
    return trueBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrueBlock(Operation newTrueBlock, NotificationChain msgs)
  {
    Operation oldTrueBlock = trueBlock;
    trueBlock = newTrueBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GobstonsPackage.CONDITIONAL__TRUE_BLOCK, oldTrueBlock, newTrueBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrueBlock(Operation newTrueBlock)
  {
    if (newTrueBlock != trueBlock)
    {
      NotificationChain msgs = null;
      if (trueBlock != null)
        msgs = ((InternalEObject)trueBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GobstonsPackage.CONDITIONAL__TRUE_BLOCK, null, msgs);
      if (newTrueBlock != null)
        msgs = ((InternalEObject)newTrueBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GobstonsPackage.CONDITIONAL__TRUE_BLOCK, null, msgs);
      msgs = basicSetTrueBlock(newTrueBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GobstonsPackage.CONDITIONAL__TRUE_BLOCK, newTrueBlock, newTrueBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getFalseBlock()
  {
    return falseBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFalseBlock(Operation newFalseBlock, NotificationChain msgs)
  {
    Operation oldFalseBlock = falseBlock;
    falseBlock = newFalseBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GobstonsPackage.CONDITIONAL__FALSE_BLOCK, oldFalseBlock, newFalseBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalseBlock(Operation newFalseBlock)
  {
    if (newFalseBlock != falseBlock)
    {
      NotificationChain msgs = null;
      if (falseBlock != null)
        msgs = ((InternalEObject)falseBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GobstonsPackage.CONDITIONAL__FALSE_BLOCK, null, msgs);
      if (newFalseBlock != null)
        msgs = ((InternalEObject)newFalseBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GobstonsPackage.CONDITIONAL__FALSE_BLOCK, null, msgs);
      msgs = basicSetFalseBlock(newFalseBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GobstonsPackage.CONDITIONAL__FALSE_BLOCK, newFalseBlock, newFalseBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GobstonsPackage.CONDITIONAL__BOOL_EXPRESION:
        return basicSetBoolExpresion(null, msgs);
      case GobstonsPackage.CONDITIONAL__TRUE_BLOCK:
        return basicSetTrueBlock(null, msgs);
      case GobstonsPackage.CONDITIONAL__FALSE_BLOCK:
        return basicSetFalseBlock(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GobstonsPackage.CONDITIONAL__BOOL_EXPRESION:
        return getBoolExpresion();
      case GobstonsPackage.CONDITIONAL__TRUE_BLOCK:
        return getTrueBlock();
      case GobstonsPackage.CONDITIONAL__FALSE_BLOCK:
        return getFalseBlock();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GobstonsPackage.CONDITIONAL__BOOL_EXPRESION:
        setBoolExpresion((HayBolitas)newValue);
        return;
      case GobstonsPackage.CONDITIONAL__TRUE_BLOCK:
        setTrueBlock((Operation)newValue);
        return;
      case GobstonsPackage.CONDITIONAL__FALSE_BLOCK:
        setFalseBlock((Operation)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GobstonsPackage.CONDITIONAL__BOOL_EXPRESION:
        setBoolExpresion((HayBolitas)null);
        return;
      case GobstonsPackage.CONDITIONAL__TRUE_BLOCK:
        setTrueBlock((Operation)null);
        return;
      case GobstonsPackage.CONDITIONAL__FALSE_BLOCK:
        setFalseBlock((Operation)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GobstonsPackage.CONDITIONAL__BOOL_EXPRESION:
        return boolExpresion != null;
      case GobstonsPackage.CONDITIONAL__TRUE_BLOCK:
        return trueBlock != null;
      case GobstonsPackage.CONDITIONAL__FALSE_BLOCK:
        return falseBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionalImpl
