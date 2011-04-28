/**
 * <copyright>
 * Copyright  2008 by Carnegie Mellon University, all rights reserved.
 *
 * Use of the Open Source AADL Tool Environment (OSATE) is subject to the terms of the license set forth
 * at http://www.eclipse.org/org/documents/epl-v10.html.
 *
 * NO WARRANTY
 *
 * ANY INFORMATION, MATERIALS, SERVICES, INTELLECTUAL PROPERTY OR OTHER PROPERTY OR RIGHTS GRANTED OR PROVIDED BY
 * CARNEGIE MELLON UNIVERSITY PURSUANT TO THIS LICENSE (HEREINAFTER THE "DELIVERABLES") ARE ON AN "AS-IS" BASIS.
 * CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR A PARTICULAR PURPOSE, MERCHANTABILITY, INFORMATIONAL CONTENT,
 * NONINFRINGEMENT, OR ERROR-FREE OPERATION. CARNEGIE MELLON UNIVERSITY SHALL NOT BE LIABLE FOR INDIRECT, SPECIAL OR
 * CONSEQUENTIAL DAMAGES, SUCH AS LOSS OF PROFITS OR INABILITY TO USE SAID INTELLECTUAL PROPERTY, UNDER THIS LICENSE,
 * REGARDLESS OF WHETHER SUCH PARTY WAS AWARE OF THE POSSIBILITY OF SUCH DAMAGES. LICENSEE AGREES THAT IT WILL NOT
 * MAKE ANY WARRANTY ON BEHALF OF CARNEGIE MELLON UNIVERSITY, EXPRESS OR IMPLIED, TO ANY PERSON CONCERNING THE
 * APPLICATION OF OR THE RESULTS TO BE OBTAINED WITH THE DELIVERABLES UNDER THIS LICENSE.
 *
 * Licensee hereby agrees to defend, indemnify, and hold harmless Carnegie Mellon University, its trustees, officers,
 * employees, and agents from all claims or demands made against them (and any related losses, expenses, or
 * attorney's fees) arising out of, or relating to Licensee's and/or its sub licensees' negligent use or willful
 * misuse of or negligent conduct or willful misconduct regarding the Software, facilities, or other rights or
 * assistance granted by Carnegie Mellon University under this License, including, but not limited to, any claims of
 * product liability, personal injury, death, damage to property, or violation of any laws or regulations.
 *
 * Carnegie Mellon University Software Engineering Institute authored documents are sponsored by the U.S. Department
 * of Defense under Contract F19628-00-C-0003. Carnegie Mellon University retains copyrights in all material produced
 * under this contract. The U.S. Government retains a non-exclusive, royalty-free license to publish or reproduce these
 * documents, or allow others to do so, for U.S. Government purposes only pursuant to the copyright license
 * under the contract clause at 252.227.7013.
 * </copyright>
 *
 * $Id: FeatureGroupImpl.java,v 1.35 2010-05-04 18:13:32 lwrage Exp $
 */
package org.osate.aadl2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.Feature;
import org.osate.aadl2.FeatureGroup;
import org.osate.aadl2.FeatureGroupType;
import org.osate.aadl2.Property;
import org.osate.aadl2.properties.InvalidModelException;
import org.osate.aadl2.properties.PropertyAcc;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.aadl2.impl.FeatureGroupImpl#isInverse <em>Inverse</em>}</li>
 *   <li>{@link org.osate.aadl2.impl.FeatureGroupImpl#getFeatureGroupType <em>Feature Group Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureGroupImpl extends DirectedFeatureImpl implements
		FeatureGroup {
	/**
	 * The default value of the '{@link #isInverse() <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERSE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInverse() <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverse()
	 * @generated
	 * @ordered
	 */
	protected boolean inverse = INVERSE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getFeatureGroupType() <em>Feature Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureGroupType()
	 * @generated
	 * @ordered
	 */
	protected FeatureGroupType featureGroupType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getFeatureGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInverse() {
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverse(boolean newInverse) {
		boolean oldInverse = inverse;
		inverse = newInverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Aadl2Package.FEATURE_GROUP__INVERSE, oldInverse, inverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupType getFeatureGroupType() {
		if (featureGroupType != null && ((EObject) featureGroupType).eIsProxy()) {
			InternalEObject oldFeatureGroupType = (InternalEObject) featureGroupType;
			featureGroupType = (FeatureGroupType) eResolveProxy(oldFeatureGroupType);
			if (featureGroupType != oldFeatureGroupType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Aadl2Package.FEATURE_GROUP__FEATURE_GROUP_TYPE,
							oldFeatureGroupType, featureGroupType));
			}
		}
		return featureGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupType basicGetFeatureGroupType() {
		return featureGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureGroupType(FeatureGroupType newFeatureGroupType) {
		FeatureGroupType oldFeatureGroupType = featureGroupType;
		featureGroupType = newFeatureGroupType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Aadl2Package.FEATURE_GROUP__FEATURE_GROUP_TYPE,
					oldFeatureGroupType, featureGroupType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Aadl2Package.FEATURE_GROUP__INVERSE:
			return isInverse();
		case Aadl2Package.FEATURE_GROUP__FEATURE_GROUP_TYPE:
			if (resolve)
				return getFeatureGroupType();
			return basicGetFeatureGroupType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Aadl2Package.FEATURE_GROUP__INVERSE:
			setInverse((Boolean) newValue);
			return;
		case Aadl2Package.FEATURE_GROUP__FEATURE_GROUP_TYPE:
			setFeatureGroupType((FeatureGroupType) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case Aadl2Package.FEATURE_GROUP__INVERSE:
			setInverse(INVERSE_EDEFAULT);
			return;
		case Aadl2Package.FEATURE_GROUP__FEATURE_GROUP_TYPE:
			setFeatureGroupType((FeatureGroupType) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Aadl2Package.FEATURE_GROUP__INVERSE:
			return inverse != INVERSE_EDEFAULT;
		case Aadl2Package.FEATURE_GROUP__FEATURE_GROUP_TYPE:
			return featureGroupType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (inverse: ");
		result.append(inverse);
		result.append(')');
		return result.toString();
	}

	/**
	 * return the index of the feature in the feature group type
	 * @param feature Feature
	 * @return int index of feature or -1 if not found
	 */
	public int getIndexOf(Feature feature) {
		if (getFeatureGroupType() == null)
			return -1;
		return getFeatureGroupType().getIndexOf(feature);
	}

	@Override
	public boolean acceptsProperty(Property property) {
		if (super.acceptsProperty(property))
			return true;
		else if (getFeatureGroupType() != null)
			return getFeatureGroupType().checkAppliesToClassifier(property);
		else
			return false;
	}

	@Override
	public void getPropertyValueInternalHelper(final Property prop,
			final PropertyAcc pas, final boolean fromInstanceSlaveCall)
			throws InvalidModelException {
		// values from feature group type
		FeatureGroupType fgt = getFeatureGroupType();
		// TODO: Check if the property applies to the feature group type? (-> property.checkAppliesTo(NamedElement)?)
		if (fgt != null) {
			fgt.getPropertyValueInternal(prop, pas, fromInstanceSlaveCall);
		}
	}

	public void getPropertyValueTestHelper(Property prop, PropertyAcc pas,
			Classifier cl) {
		// values from feature group type
		FeatureGroupType fgt = getFeatureGroupType();
		// TODO: Check if the property applies to the feature group type? (-> property.checkAppliesTo(NamedElement)?)
		if (fgt != null) {
			fgt.getPropertyValueInternal(prop, pas, true);
		} else if (cl != null) {
			cl.getPropertyValueInternal(prop, pas, true);
		}
	}

} //FeatureGroupImpl
