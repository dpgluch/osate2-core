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
 * CARNEGIE MELLON UNIVERSITY PURSUANT TO THIS LICENSE (HEREINAFTER THE ''DELIVERABLES'') ARE ON AN ''AS-IS'' BASIS.
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
 *
 * $Id: ListValueImpl.java,v 1.3 2010-06-15 20:46:20 lwrage Exp $
 */
package org.osate.aadl2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osate.aadl2.Aadl2Factory;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.ListValue;
import org.osate.aadl2.PropertyExpression;
import org.osate.aadl2.properties.EvaluatedProperty;
import org.osate.aadl2.properties.EvaluationContext;
import org.osate.aadl2.properties.InvalidModelException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.aadl2.impl.ListValueImpl#getOwnedListElements <em>Owned List Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListValueImpl extends PropertyExpressionImpl implements ListValue {
	/**
	 * The cached value of the '{@link #getOwnedListElements() <em>Owned List Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedListElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyExpression> ownedListElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getListValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyExpression> getOwnedListElements() {
		if (ownedListElements == null) {
			ownedListElements = new EObjectContainmentEList<PropertyExpression>(PropertyExpression.class, this,
					Aadl2Package.LIST_VALUE__OWNED_LIST_ELEMENT);
		}
		return ownedListElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyExpression createOwnedListElement(EClass eClass) {
		PropertyExpression newOwnedListElement = (PropertyExpression) create(eClass);
		getOwnedListElements().add(newOwnedListElement);
		return newOwnedListElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aadl2Package.LIST_VALUE__OWNED_LIST_ELEMENT:
			return ((InternalEList<?>) getOwnedListElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Aadl2Package.LIST_VALUE__OWNED_LIST_ELEMENT:
			return getOwnedListElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Aadl2Package.LIST_VALUE__OWNED_LIST_ELEMENT:
			getOwnedListElements().clear();
			getOwnedListElements().addAll((Collection<? extends PropertyExpression>) newValue);
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
		case Aadl2Package.LIST_VALUE__OWNED_LIST_ELEMENT:
			getOwnedListElements().clear();
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
		case Aadl2Package.LIST_VALUE__OWNED_LIST_ELEMENT:
			return ownedListElements != null && !ownedListElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean sameAs(PropertyExpression pe) {
		if (this == pe) {
			return true;
		}
		if (pe == null || getClass() != pe.getClass()) {
			return false;
		}
		ListValueImpl other = (ListValueImpl) pe;
		if (ownedListElements == null && other.ownedListElements != null
				|| ownedListElements != null && other.ownedListElements == null) {
			return false;
		}
		if (ownedListElements == other.ownedListElements) {
			return true;
		}
		if (ownedListElements.size() != other.ownedListElements.size()) {
			return false;
		}

		for (int i = 0; i < ownedListElements.size(); ++i) {
			PropertyExpression pe1 = ownedListElements.get(i);
			PropertyExpression pe2 = other.ownedListElements.get(i);
			if (pe1 == null ? pe2 != null : !pe1.sameAs(pe2)) {
				return false;
			}
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osate.aadl2.impl.PropertyExpressionImpl#evaluate(org.osate.aadl2.properties.EvaluationContext, int)
	 */
	@Override
	public EvaluatedProperty evaluate(EvaluationContext ctx, int depth) {
		// evaluate each list element
		ListValue newVal = Aadl2Factory.eINSTANCE.createListValue();
		int i = 0;
		for (PropertyExpression elem : getOwnedListElements()) {
			i += 1;
			EvaluatedProperty elemVal = elem.evaluate(ctx, depth + 1);
			if (elemVal.isEmpty()) {
				throw new InvalidModelException(this, "Element " + i + " has no value");
			}
			if (elemVal.size() > 1) {
				throw new InvalidModelException(this, "Element " + i + " has multiple values");
			}
			if (elemVal.first().isModal()) {
				throw new InvalidModelException(this, "Element " + i + ": value is modal");
			}
			PropertyExpression exp = elemVal.first().getValue();
			newVal.getOwnedListElements().add(exp);
		}
		return new EvaluatedProperty(newVal);
	}

} // ListValueImpl
