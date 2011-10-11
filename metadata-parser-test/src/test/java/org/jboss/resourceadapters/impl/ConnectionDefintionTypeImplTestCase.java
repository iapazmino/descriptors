package org.jboss.resourceadapters.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.resourceadapters.api.ConnectionDefintionType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.resourceadapters.api.ConfigPropertyType;
import org.jboss.resourceadapters.impl.ConfigPropertyTypeImpl;
import org.jboss.resourceadapters.api.PoolType;
import org.jboss.resourceadapters.impl.PoolTypeImpl;
import org.jboss.resourceadapters.api.XaPoolType;
import org.jboss.resourceadapters.impl.XaPoolTypeImpl;
import org.jboss.resourceadapters.api.SecurityType;
import org.jboss.resourceadapters.impl.SecurityTypeImpl;
import org.jboss.resourceadapters.api.TimeoutType;
import org.jboss.resourceadapters.impl.TimeoutTypeImpl;
import org.jboss.resourceadapters.api.ValidationType;
import org.jboss.resourceadapters.impl.ValidationTypeImpl;
import org.jboss.resourceadapters.api.RecoverType;
import org.jboss.resourceadapters.impl.RecoverTypeImpl;

public class ConnectionDefintionTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testClassName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.className("test");
      assertEquals(type.getClassName(), "test");
      type.removeClassName();
      assertNull(type.getClassName());
   }
   
   @Test
   public void testJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.jndiName("test");
      assertEquals(type.getJndiName(), "test");
      type.removeJndiName();
      assertNull(type.getJndiName());
   }
   
   @Test
   public void testEnabled() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.enabled(true);
      assertTrue(type.isEnabled());
      type.removeEnabled();
      assertFalse(type.isEnabled());
   }
   
   @Test
   public void testUseJavaContext() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.useJavaContext(true);
      assertTrue(type.isUseJavaContext());
      type.removeUseJavaContext();
      assertFalse(type.isUseJavaContext());
   }
   
   @Test
   public void testPoolName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.poolName("test");
      assertEquals(type.getPoolName(), "test");
      type.removePoolName();
      assertNull(type.getPoolName());
   }
   
   @Test
   public void testConfigProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.createConfigProperty().up();
      type.createConfigProperty().up();
      assertTrue(type.getAllConfigProperty().size() == 2);
      type.removeAllConfigProperty();
      assertTrue(type.getAllConfigProperty().size() == 0);
   }

   
   @Test
   public void testPool() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreatePool().up();
      type.removePool();
      assertNull(provider.getRootNode().getSingle("pool"));
   }

   
   @Test
   public void testXaPool() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateXaPool().up();
      type.removeXaPool();
      assertNull(provider.getRootNode().getSingle("xa-pool"));
   }

   
   @Test
   public void testSecurity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateSecurity().up();
      type.removeSecurity();
      assertNull(provider.getRootNode().getSingle("security"));
   }

   
   @Test
   public void testTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateTimeout().up();
      type.removeTimeout();
      assertNull(provider.getRootNode().getSingle("timeout"));
   }

   
   @Test
   public void testValidation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateValidation().up();
      type.removeValidation();
      assertNull(provider.getRootNode().getSingle("validation"));
   }

   
   @Test
   public void testRecovery() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateRecovery().up();
      type.removeRecovery();
      assertNull(provider.getRootNode().getSingle("recovery"));
   }

   
   @Test
   public void testUseCcm() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.useCcm(true);
      assertTrue(type.isUseCcm());
      type.removeUseCcm();
      assertFalse(type.isUseCcm());
   }
}
