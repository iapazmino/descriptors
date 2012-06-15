package org.jboss.shrinkwrap.descriptor.test.jbossweb60;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.jbossweb60.JbossWebDescriptor;
import org.jboss.shrinkwrap.descriptor.api.jbossweb60.MutableJbossWebDescriptor;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Before;
import org.junit.Test;


public class JbossWebDescriptorTestCase
{
   final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
   
   @Before
   public void init()
   {
      sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
   }
   
   @Test
   public void testGeneratedJbossWeb60Xml() throws Exception
   {  
	   MutableJbossWebDescriptor ejbJarGenerated = create().getRoot()
//            .addDefaultNamespaces()
            .version("6.0")
            .getOrCreateClassLoading().javaClassLoadingCompliance(false)
            	.getOrCreateLoaderRepository().loaderRepositoryClass("loaderRepositoryClass1")
            		.createLoaderRepositoryConfig().configParserClass("configParserClass1").up()
            		.createLoaderRepositoryConfig().configParserClass("configParserClass3").up().up().up()
            .securityDomain("security-domain0")
            .jaccStarRoleAllow("true")
            .contextRoot("context-root0")
            .virtualHost("virtual-host0")
            .virtualHost("virtual-host1")
            .useSessionCookies("true")
            .getOrCreateReplicationConfig()
            	.cacheName("cache-name0")
            	.replicationTrigger("ACCESS")
            	.replicationGranularity("SESSION")
            	.replicationMode("SYNCHRONOUS")
            	.backups(0)
            	.useJk("true")
            	.maxUnreplicatedInterval(0)
            	.snapshotMode("INSTANT")
            	.snapshotInterval(0)
            	.sessionNotificationPolicy("session-notification-policy0").up()
            .createEnvEntry()
            	.description("description0")
            	.description("description1")
            	.envEntryName("env-entry-name0")
            	.envEntryType("env-entry-type0")
            	.envEntryValue("env-entry-value0")
            	.jndiName("jndi-name0")
            	.createInjectionTarget()
            		.injectionTargetClass("injection-target-class0")
            		.injectionTargetName("$").up()
            	.createInjectionTarget()
            		.injectionTargetClass("injection-target-class1")
            		.injectionTargetName("$").up()
            	.ignoreDependency().up()
            .createEnvEntry()
            	.description("description2")
            	.description("description3")
            	.envEntryName("env-entry-name1")
            	.envEntryType("env-entry-type1")
            	.envEntryValue("env-entry-value1")
            	.mappedName("mapped-name0")
            	.createInjectionTarget()
            		.injectionTargetClass("injection-target-class2")
            		.injectionTargetName("$").up()
            	.createInjectionTarget()
            		.injectionTargetClass("injection-target-class3")
            		.injectionTargetName("$").up()
            	.ignoreDependency().up()
            .createEjbRef()
            		.description("description4")
            		.description("description5")
            		.ejbRefName("ejb-ref-name0")
            		.ejbRefType("Entity")
            		.home("home0")
            		.remote("remote0")
            		.ejbLink("ejb-link0")
            		.jndiName("jndi-name1")
            	.createInjectionTarget()
            		.injectionTargetClass("injection-target-class4")
            		.injectionTargetName("$").up()
            	.createInjectionTarget()
            		.injectionTargetClass("injection-target-class5")
            		.injectionTargetName("$").up()
            	.ignoreDependency().up()
            .createEjbRef()
        		.description("description6")
        		.description("description7")
        		.ejbRefName("ejb-ref-name1")
        		.ejbRefType("Entity")
        		.home("home1")
        		.remote("remote1")
        		.ejbLink("ejb-link1")
        		.jndiName("jndi-name2")
            	.createInjectionTarget()
            		.injectionTargetClass("injection-target-class6")
            		.injectionTargetName("$").up()
            	.createInjectionTarget()
            		.injectionTargetClass("injection-target-class7")
            		.injectionTargetName("$").up()
            	.ignoreDependency().up()
            .createEjbLocalRef()
            	.description("description8")
        		.description("description9")
        		.ejbRefName("ejb-ref-name2")
        		.ejbRefType("Entity")
        		.localHome("local-home0")
        		.local("local0")
        		.ejbLink("ejb-link2")
        		.localJndiName("local-jndi-name0")
        		.jndiName("jndi-name3")
            	.createInjectionTarget()
            		.injectionTargetClass("injection-target-class8")
            		.injectionTargetName("$").up()
            	.createInjectionTarget()
            		.injectionTargetClass("injection-target-class9")
            		.injectionTargetName("$").up()
            	.ignoreDependency().up()
            .createEjbLocalRef()
            	.description("description10")
        		.description("description11")
        		.ejbRefName("ejb-ref-name3")
        		.ejbRefType("Entity")
        		.localHome("local-home1")
        		.local("local1")
        		.ejbLink("ejb-link3")
        		.localJndiName("local-jndi-name1")
        		.mappedName("mapped-name1")
            	.createInjectionTarget()
            		.injectionTargetClass("injection-target-class10")
            		.injectionTargetName("$").up()
            	.createInjectionTarget()
            		.injectionTargetClass("injection-target-class11")
            		.injectionTargetName("$").up()
            	.ignoreDependency().up()
            .createServiceRef()
            	.serviceRefName("service-ref-name0")
            	.serviceImplClass("service-impl-class0")
            	.serviceQname("service-qname0")
            	.configName("config-name0")
            	.configFile("config-file0")
            	.handlerChain("handler-chain0")
            	.createPortComponentRef()
            		.serviceEndpointInterface("service-endpoint-interface0")
            		.portQname("port-qname0")
            		.configName("config-name1")
            		.configFile("config-file1")
            		.createStubProperty()
            			.propName("prop-name0")
            			.propValue("prop-value0").up()
            		.createStubProperty()
            			.propName("prop-name1")
            			.propValue("prop-value1").up()
            		.createCallProperty()
            			.propName("prop-name2")
            			.propValue("prop-value2").up()
            		.createCallProperty()
            			.propName("prop-name3")
            			.propValue("prop-value3").up().up()
            	.createPortComponentRef()
            		.serviceEndpointInterface("service-endpoint-interface1")
            		.portQname("port-qname1")
            		.configName("config-name2")
            		.configFile("config-file2")
            		.createStubProperty()
            			.propName("prop-name4")
            			.propValue("prop-value4").up()
            		.createStubProperty()
            			.propName("prop-name5")
            			.propValue("prop-value5").up()
            		.createCallProperty()
            			.propName("prop-name6")
            			.propValue("prop-value6").up()
            		.createCallProperty()
            			.propName("prop-name7")
            			.propValue("prop-value7").up().up()
            	.wsdlOverride("wsdl-override0").up()
            .createServiceRef()
            	.serviceRefName("service-ref-name1")
            	.serviceImplClass("service-impl-class1")
            	.serviceQname("service-qname1")
            	.configName("config-name3")
            	.configFile("config-file3")
            	.handlerChain("handler-chain1")
            	.createPortComponentRef()
            		.serviceEndpointInterface("service-endpoint-interface2")
            		.portQname("port-qname2")
            		.configName("config-name4")
            		.configFile("config-file4")
            		.createStubProperty()
            			.propName("prop-name8")
            			.propValue("prop-value8").up()
            		.createStubProperty()
            			.propName("prop-name9")
            			.propValue("prop-value9").up()
            		.createCallProperty()
            			.propName("prop-name10")
            			.propValue("prop-value10").up()
            		.createCallProperty()
            			.propName("prop-name11")
            			.propValue("prop-value11").up().up()
            	.createPortComponentRef()
            		.serviceEndpointInterface("service-endpoint-interface3")
            		.portQname("port-qname3")
            		.configName("config-name5")
            		.configFile("config-file5")
            		.createStubProperty()
            			.propName("prop-name12")
            			.propValue("prop-value12").up()
            		.createStubProperty()
            			.propName("prop-name13")
            			.propValue("prop-value13").up()
            		.createCallProperty()
            			.propName("prop-name14")
            			.propValue("prop-value14").up()
            		.createCallProperty()
            			.propName("prop-name15")
            			.propValue("prop-value15").up().up()
            	.wsdlOverride("wsdl-override1").up()
            	.createResourceRef()
            		.description("description12")
            		.description("description13")
            		.resRefName("res-ref-name0")
            		.resType("res-type0")
            		.resAuth("Application")
            		.resSharingScope("Shareable")
            		.jndiName("jndi-name4")
            		.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class12")
	            		.injectionTargetName("$").up()
	            	.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class13")
	            		.injectionTargetName("$").up()
	            	.ignoreDependency().up()
	            .createResourceRef()
            		.description("description14")
            		.description("description15")
            		.resRefName("res-ref-name1")
            		.resType("res-type1")
            		.resAuth("Application")
            		.resSharingScope("Shareable")
            		.mappedName("mapped-name2")
            		.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class14")
	            		.injectionTargetName("$").up()
	            	.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class15")
	            		.injectionTargetName("$").up()
	            	.ignoreDependency().up()
	            .createResourceEnvRef()
	            	.description("description16")
            		.description("description17")
            		.resourceEnvRefName("resource-env-ref-name0")
            		.resourceEnvRefType("resource-env-ref-type0")
            		.mappedName("mapped-name3")
            		.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class16")
	            		.injectionTargetName("$").up()
	            	.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class17")
	            		.injectionTargetName("$").up()
	            	.ignoreDependency().up()
	            .createResourceEnvRef()
	            	.description("description18")
            		.description("description19")
            		.resourceEnvRefName("resource-env-ref-name1")
            		.resourceEnvRefType("resource-env-ref-type1")
            		.jndiName("jndi-name5")
            		.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class18")
	            		.injectionTargetName("$").up()
	            	.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class19")
	            		.injectionTargetName("$").up()
	            	.ignoreDependency().up()
	            .createMessageDestinationRef()
	            	.description("description20")
            		.description("description21")
            		.messageDestinationRefName("message-destination-ref-name0")
            		.messageDestinationType("message-destination-type0")
            		.messageDestinationUsage("Consumes")
            		.messageDestinationLink("message-destination-link0")
            		.mappedName("mapped-name4")
            		.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class20")
	            		.injectionTargetName("$").up()
	            	.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class21")
	            		.injectionTargetName("$").up()
	            	.ignoreDependency().up()
	            .createMessageDestinationRef()
	            	.description("description22")
            		.description("description23")
            		.messageDestinationRefName("message-destination-ref-name1")
            		.messageDestinationType("message-destination-type1")
            		.messageDestinationUsage("Consumes")
            		.messageDestinationLink("message-destination-link1")
            		.jndiName("jndi-name6")
            		.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class22")
	            		.injectionTargetName("$").up()
	            	.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class23")
	            		.injectionTargetName("$").up()
	            	.ignoreDependency().up()
	            .createPersistenceContextRef()
	            	.description("description24")
            		.description("description25")
            		.persistenceContextRefName("persistence-context-ref-name0")
            		.persistenceUnitName("persistence-unit-name0")
            		.persistenceContextType("Transaction")
            		.createPersistenceProperty()
            			.name("name0")
            			.value("value0").up()
            		.createPersistenceProperty()
            			.name("name1")
            			.value("value1").up()
            		.mappedName("mapped-name5")
            		.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class24")
	            		.injectionTargetName("$").up()
	            	.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class25")
	            		.injectionTargetName("$").up()
	            	.ignoreDependency().up()
	            .createPersistenceContextRef()
	            	.description("description26")
            		.description("description27")
            		.persistenceContextRefName("persistence-context-ref-name1")
            		.persistenceUnitName("persistence-unit-name1")
            		.persistenceContextType("Transaction")
            		.createPersistenceProperty()
            			.name("name2")
            			.value("value2").up()
            		.createPersistenceProperty()
            			.name("name3")
            			.value("value3").up()
            		.mappedName("mapped-name6")
            		.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class26")
	            		.injectionTargetName("$").up()
	            	.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class27")
	            		.injectionTargetName("$").up()
	            	.ignoreDependency().up()
            	.createPersistenceUnitRef()
            		.description("description28")
            		.description("description29")
            		.persistenceUnitRefName("persistence-unit-ref-name0")
            		.persistenceUnitName("persistence-unit-name2")
            		.jndiName("jndi-name7")            		
            		.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class28")
	            		.injectionTargetName("$").up()
	            	.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class29")
	            		.injectionTargetName("$").up()
	            	.ignoreDependency().up()
	            .createPersistenceUnitRef()
            		.description("description30")
            		.description("description31")
            		.persistenceUnitRefName("persistence-unit-ref-name1")
            		.persistenceUnitName("persistence-unit-name3")
            		.mappedName("mapped-name7")            		
            		.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class30")
	            		.injectionTargetName("$").up()
	            	.createInjectionTarget()
	            		.injectionTargetClass("injection-target-class31")
	            		.injectionTargetName("$").up()
	            	.ignoreDependency().up()
	            .createPostConstruct()
	            	.lifecycleCallbackClass("lifecycle-callback-class0")
	            	.lifecycleCallbackMethod("$").up()
	            .createPostConstruct()
	            	.lifecycleCallbackClass("lifecycle-callback-class1")
	            	.lifecycleCallbackMethod("$").up()
	            .createPreDestroy()
	            	.lifecycleCallbackClass("lifecycle-callback-class2")
	            	.lifecycleCallbackMethod("$").up()
	            .createPreDestroy()
	            	.lifecycleCallbackClass("lifecycle-callback-class3")
	            	.lifecycleCallbackMethod("$").up()
	            .createDataSource()
	            	.description("description32")
	            	.name("name0")
	            	.className("class-name0")
	            	.serverName("server-name0")
	            	.portNumber(0)
	            	.databaseName("database-name0")
	            	.url("jdbc::")
	            	.user("user0")
	            	.password("password0")
	            	.createProperty()
	            		.name("name4")
	            		.value("value4").up()
	            	.createProperty()
	            		.name("name5")
	            		.value("value5").up()
	            	.loginTimeout(0)
	            	.transactional(false)
	            	.isolationLevel("TRANSACTION_READ_UNCOMMITTED")
	            	.initialPoolSize(0)
	            	.maxPoolSize(0)
	            	.minPoolSize(0)
	            	.maxIdleTime(0)
	            	.maxStatements(0).up()
	            .createDataSource()
	            	.description("description33")
	            	.name("name1")
	            	.className("class-name1")
	            	.serverName("server-name1")
	            	.portNumber(0)
	            	.databaseName("database-name1")
	            	.url("jdbc::")
	            	.user("user1")
	            	.password("password1")
	            	.createProperty()
	            		.name("name6")
	            		.value("value6").up()
	            	.createProperty()
	            		.name("name7")
	            		.value("value7").up()
	            	.loginTimeout(0)
	            	.transactional(false)
	            	.isolationLevel("TRANSACTION_READ_UNCOMMITTED")
	            	.initialPoolSize(0)
	            	.maxPoolSize(0)
	            	.minPoolSize(0)
	            	.maxIdleTime(0)
	            	.maxStatements(0).up()
	            .createSecurityRole()
	            	.description("description34")
	            	.description("description35")
	            	.roleName("role-name0")
	            	.principalName("principal-name0")
	            	.principalName("principal-name1").up()
	            .createSecurityRole()
	            	.description("description36")
	            	.description("description37")
	            	.roleName("role-name1")
	            	.principalName("principal-name2")
	            	.principalName("principal-name3").up()
	            .createMessageDestination()
	            	.description("description38")
	            	.description("description39")
	            	.displayName("display-name0")
	            	.displayName("display-name1")
	            	.createIcon()
	            		.smallIcon("small-icon0")
	            		.largeIcon("large-icon0").up()
	            	.createIcon()
	            		.smallIcon("small-icon1")
	            		.largeIcon("large-icon1").up()
	            	.messageDestinationName("message-destination-name0")
	            	.mappedName("mapped-name8")
	            	.lookupName("lookup-name0").up()
	            .createMessageDestination()
	            	.description("description40")
	            	.description("description41")
	            	.displayName("display-name2")
	            	.displayName("display-name3")
	            	.createIcon()
	            		.smallIcon("small-icon2")
	            		.largeIcon("large-icon2").up()
	            	.createIcon()
	            		.smallIcon("small-icon3")
	            		.largeIcon("large-icon3").up()
	            	.messageDestinationName("message-destination-name1")
	            	.mappedName("mapped-name9")
	            	.lookupName("lookup-name1").up()
	            .createWebserviceDescription()
	            	.webserviceDescriptionName("webservice-description-name0")
	            	.configName("config-name6")
	            	.configFile("config-file6")
	            	.wsdlPublishLocation("wsdl-publish-location0").up()
	            .createWebserviceDescription()
	            	.webserviceDescriptionName("webservice-description-name1")
	            	.configName("config-name7")
	            	.configFile("config-file7")
	            	.wsdlPublishLocation("wsdl-publish-location1").up()
	            .depends("depends0")
	            .depends("depends1")
	            .createServlet()
	            	.servletName("servlet-name0")
	            	.runAsPrincipal("run-as-principal0")
	            	.getOrCreateServletSecurity()
	            		.emptyRoleSemantic("empty-role-semantic0")
	            		.transportGuarantee("NONE")
	            		.rolesAllowed("roles-allowed0")
	            		.rolesAllowed("roles-allowed1")
	            		.createHttpMethodConstraint()
	            			.method("method0")
	            			.emptyRoleSemantic("PERMIT")
	            			.transportGuarantee("NONE")
	            			.rolesAllowed("roles-allowed2")
	            			.rolesAllowed("roles-allowed3").up()
	            		.createHttpMethodConstraint()
	            			.method("method1")
	            			.emptyRoleSemantic("PERMIT")
	            			.transportGuarantee("NONE")
	            			.rolesAllowed("roles-allowed4")
	            			.rolesAllowed("roles-allowed5").up().up().up()
	            .createServlet()
	            	.servletName("servlet-name1")
	            	.runAsPrincipal("run-as-principal1")
	            	.getOrCreateServletSecurity()
	            		.emptyRoleSemantic("empty-role-semantic3")
	            		.transportGuarantee("NONE")
	            		.rolesAllowed("roles-allowed6")
	            		.rolesAllowed("roles-allowed7")
	            		.createHttpMethodConstraint()
	            			.method("method2")
	            			.emptyRoleSemantic("PERMIT")
	            			.transportGuarantee("NONE")
	            			.rolesAllowed("roles-allowed8")
	            			.rolesAllowed("roles-allowed9").up()
	            		.createHttpMethodConstraint()
	            			.method("method3")
	            			.emptyRoleSemantic("PERMIT")
	            			.transportGuarantee("NONE")
	            			.rolesAllowed("roles-allowed10")
	            			.rolesAllowed("roles-allowed11").up().up().up()
	            .maxActiveSessions(0)
	            .getOrCreatePassivationConfig()
	            	.useSessionPassivation("true")
	            	.passivationMinIdleTime(0)
	            	.passivationMaxIdleTime(0).up()
	            .getOrCreateAnnotation()
	            	.className("class-name2")
	            	.getOrCreateServletSecurity()
	            		.emptyRoleSemantic("empty-role-semantic6")
	            		.transportGuarantee("NONE")
	            		.rolesAllowed("roles-allowed12")
	            		.rolesAllowed("roles-allowed13")
	            		.createHttpMethodConstraint()
	            			.method("method4")
	            			.emptyRoleSemantic("PERMIT")
	            			.transportGuarantee("NONE")
	            			.rolesAllowed("roles-allowed14")
	            			.rolesAllowed("roles-allowed15").up()
	            		.createHttpMethodConstraint()
	            			.method("method5")
	            			.emptyRoleSemantic("PERMIT")
	            			.transportGuarantee("NONE")
	            			.rolesAllowed("roles-allowed16")
	            			.rolesAllowed("roles-allowed17").up().up()
	            	.getOrCreateRunAs()
	            		.description("description42")
	            		.description("description43")
	            		.roleName("role-name2").up()
	            .getOrCreateMultipartConfig()
	            	.location("location0")
	            	.maxFileSize(-1073741773L)
	            	.maxRequestSize(-1073741773L)
	            	.fileSizeThreshold(0).up().up().up()
           ;                     
      
      String webXmlGenerated = ejbJarGenerated.exportAsString();
      String webXmlOriginal = getResourceContents("src/test/resources/test-gen-jbossweb60.xml");
           
      XmlAssert.assertIdentical(webXmlOriginal, webXmlGenerated);   
   }
   
   
   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   private String getResourceContents(String resource) throws Exception
   {
      assert resource != null && resource.length() > 0 : "Resource must be specified";
      final BufferedReader reader = new BufferedReader(new FileReader(resource));
      final StringBuilder builder = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null)
      {
         builder.append(line);
         builder.append("\n");
      }
      return builder.toString();
   }
   
   private MutableJbossWebDescriptor create()
   {
      return Descriptors.create(MutableJbossWebDescriptor.class);
   }
   
}
