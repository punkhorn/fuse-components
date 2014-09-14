/**
 * Copyright 2013 Red Hat, Inc.
 * 
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 */
package org.fusesource.camel.component.sap.model.rfc.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.fusesource.camel.component.sap.model.rfc.util.RfcAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RfcItemProviderAdapterFactory extends RfcAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RfcItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.Destination} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationItemProvider destinationItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.Destination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDestinationAdapter() {
		if (destinationItemProvider == null) {
			destinationItemProvider = new DestinationItemProvider(this);
		}

		return destinationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.RFC} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RFCItemProvider rfcItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.RFC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRFCAdapter() {
		if (rfcItemProvider == null) {
			rfcItemProvider = new RFCItemProvider(this);
		}

		return rfcItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.Table} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableItemProvider tableItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableAdapter() {
		if (tableItemProvider == null) {
			tableItemProvider = new TableItemProvider(this);
		}

		return tableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.Structure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureItemProvider structureItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.Structure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructureAdapter() {
		if (structureItemProvider == null) {
			structureItemProvider = new StructureItemProvider(this);
		}

		return structureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.Request} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestItemProvider requestItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.Request}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequestAdapter() {
		if (requestItemProvider == null) {
			requestItemProvider = new RequestItemProvider(this);
		}

		return requestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.Response} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseItemProvider responseItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.Response}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponseAdapter() {
		if (responseItemProvider == null) {
			responseItemProvider = new ResponseItemProvider(this);
		}

		return responseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.SapConnectionConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SapConnectionConfigurationItemProvider sapConnectionConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.SapConnectionConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSapConnectionConfigurationAdapter() {
		if (sapConnectionConfigurationItemProvider == null) {
			sapConnectionConfigurationItemProvider = new SapConnectionConfigurationItemProvider(this);
		}

		return sapConnectionConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationDataEntryItemProvider destinationDataEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDestinationDataEntryAdapter() {
		if (destinationDataEntryItemProvider == null) {
			destinationDataEntryItemProvider = new DestinationDataEntryItemProvider(this);
		}

		return destinationDataEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.DestinationData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationDataItemProvider destinationDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.DestinationData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDestinationDataAdapter() {
		if (destinationDataItemProvider == null) {
			destinationDataItemProvider = new DestinationDataItemProvider(this);
		}

		return destinationDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationDataStoreEntryItemProvider destinationDataStoreEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDestinationDataStoreEntryAdapter() {
		if (destinationDataStoreEntryItemProvider == null) {
			destinationDataStoreEntryItemProvider = new DestinationDataStoreEntryItemProvider(this);
		}

		return destinationDataStoreEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.DestinationDataStore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationDataStoreItemProvider destinationDataStoreItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.DestinationDataStore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDestinationDataStoreAdapter() {
		if (destinationDataStoreItemProvider == null) {
			destinationDataStoreItemProvider = new DestinationDataStoreItemProvider(this);
		}

		return destinationDataStoreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.Server} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerItemProvider serverItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.Server}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServerAdapter() {
		if (serverItemProvider == null) {
			serverItemProvider = new ServerItemProvider(this);
		}

		return serverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerDataEntryItemProvider serverDataEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServerDataEntryAdapter() {
		if (serverDataEntryItemProvider == null) {
			serverDataEntryItemProvider = new ServerDataEntryItemProvider(this);
		}

		return serverDataEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.ServerData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerDataItemProvider serverDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.ServerData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServerDataAdapter() {
		if (serverDataItemProvider == null) {
			serverDataItemProvider = new ServerDataItemProvider(this);
		}

		return serverDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerDataStoreEntryItemProvider serverDataStoreEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServerDataStoreEntryAdapter() {
		if (serverDataStoreEntryItemProvider == null) {
			serverDataStoreEntryItemProvider = new ServerDataStoreEntryItemProvider(this);
		}

		return serverDataStoreEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.ServerDataStore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerDataStoreItemProvider serverDataStoreItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.ServerDataStore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServerDataStoreAdapter() {
		if (serverDataStoreItemProvider == null) {
			serverDataStoreItemProvider = new ServerDataStoreItemProvider(this);
		}

		return serverDataStoreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.FunctionTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionTemplateItemProvider functionTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.FunctionTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionTemplateAdapter() {
		if (functionTemplateItemProvider == null) {
			functionTemplateItemProvider = new FunctionTemplateItemProvider(this);
		}

		return functionTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.RecordMetaData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordMetaDataItemProvider recordMetaDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.RecordMetaData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecordMetaDataAdapter() {
		if (recordMetaDataItemProvider == null) {
			recordMetaDataItemProvider = new RecordMetaDataItemProvider(this);
		}

		return recordMetaDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.FieldMetaData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldMetaDataItemProvider fieldMetaDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.FieldMetaData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFieldMetaDataAdapter() {
		if (fieldMetaDataItemProvider == null) {
			fieldMetaDataItemProvider = new FieldMetaDataItemProvider(this);
		}

		return fieldMetaDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.ListFieldMetaData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListFieldMetaDataItemProvider listFieldMetaDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.ListFieldMetaData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListFieldMetaDataAdapter() {
		if (listFieldMetaDataItemProvider == null) {
			listFieldMetaDataItemProvider = new ListFieldMetaDataItemProvider(this);
		}

		return listFieldMetaDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.AbapException} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbapExceptionItemProvider abapExceptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.AbapException}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbapExceptionAdapter() {
		if (abapExceptionItemProvider == null) {
			abapExceptionItemProvider = new AbapExceptionItemProvider(this);
		}

		return abapExceptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryDataEntryItemProvider repositoryDataEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryDataEntryAdapter() {
		if (repositoryDataEntryItemProvider == null) {
			repositoryDataEntryItemProvider = new RepositoryDataEntryItemProvider(this);
		}

		return repositoryDataEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.RepositoryData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryDataItemProvider repositoryDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.RepositoryData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryDataAdapter() {
		if (repositoryDataItemProvider == null) {
			repositoryDataItemProvider = new RepositoryDataItemProvider(this);
		}

		return repositoryDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.RepositoryDataStore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryDataStoreItemProvider repositoryDataStoreItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.RepositoryDataStore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryDataStoreAdapter() {
		if (repositoryDataStoreItemProvider == null) {
			repositoryDataStoreItemProvider = new RepositoryDataStoreItemProvider(this);
		}

		return repositoryDataStoreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryDataStoreEntryItemProvider repositoryDataStoreEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryDataStoreEntryAdapter() {
		if (repositoryDataStoreEntryItemProvider == null) {
			repositoryDataStoreEntryItemProvider = new RepositoryDataStoreEntryItemProvider(this);
		}

		return repositoryDataStoreEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TIDStoreEntryItemProvider tidStoreEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTIDStoreEntryAdapter() {
		if (tidStoreEntryItemProvider == null) {
			tidStoreEntryItemProvider = new TIDStoreEntryItemProvider(this);
		}

		return tidStoreEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.fusesource.camel.component.sap.model.rfc.TIDStore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TIDStoreItemProvider tidStoreItemProvider;

	/**
	 * This creates an adapter for a {@link org.fusesource.camel.component.sap.model.rfc.TIDStore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTIDStoreAdapter() {
		if (tidStoreItemProvider == null) {
			tidStoreItemProvider = new TIDStoreItemProvider(this);
		}

		return tidStoreItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (destinationItemProvider != null) destinationItemProvider.dispose();
		if (rfcItemProvider != null) rfcItemProvider.dispose();
		if (tableItemProvider != null) tableItemProvider.dispose();
		if (structureItemProvider != null) structureItemProvider.dispose();
		if (requestItemProvider != null) requestItemProvider.dispose();
		if (responseItemProvider != null) responseItemProvider.dispose();
		if (sapConnectionConfigurationItemProvider != null) sapConnectionConfigurationItemProvider.dispose();
		if (destinationDataEntryItemProvider != null) destinationDataEntryItemProvider.dispose();
		if (destinationDataItemProvider != null) destinationDataItemProvider.dispose();
		if (destinationDataStoreEntryItemProvider != null) destinationDataStoreEntryItemProvider.dispose();
		if (destinationDataStoreItemProvider != null) destinationDataStoreItemProvider.dispose();
		if (serverItemProvider != null) serverItemProvider.dispose();
		if (serverDataEntryItemProvider != null) serverDataEntryItemProvider.dispose();
		if (serverDataItemProvider != null) serverDataItemProvider.dispose();
		if (serverDataStoreEntryItemProvider != null) serverDataStoreEntryItemProvider.dispose();
		if (serverDataStoreItemProvider != null) serverDataStoreItemProvider.dispose();
		if (functionTemplateItemProvider != null) functionTemplateItemProvider.dispose();
		if (recordMetaDataItemProvider != null) recordMetaDataItemProvider.dispose();
		if (fieldMetaDataItemProvider != null) fieldMetaDataItemProvider.dispose();
		if (listFieldMetaDataItemProvider != null) listFieldMetaDataItemProvider.dispose();
		if (abapExceptionItemProvider != null) abapExceptionItemProvider.dispose();
		if (repositoryDataEntryItemProvider != null) repositoryDataEntryItemProvider.dispose();
		if (repositoryDataItemProvider != null) repositoryDataItemProvider.dispose();
		if (repositoryDataStoreItemProvider != null) repositoryDataStoreItemProvider.dispose();
		if (repositoryDataStoreEntryItemProvider != null) repositoryDataStoreEntryItemProvider.dispose();
		if (tidStoreEntryItemProvider != null) tidStoreEntryItemProvider.dispose();
		if (tidStoreItemProvider != null) tidStoreItemProvider.dispose();
	}

}
