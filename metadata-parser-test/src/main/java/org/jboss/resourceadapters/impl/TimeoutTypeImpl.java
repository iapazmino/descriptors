package org.jboss.resourceadapters.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.resourceadapters.api.TimeoutType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> timeoutType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:31.029-07:00
 */
public class TimeoutTypeImpl<T> implements Child<T>, TimeoutType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public TimeoutTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public TimeoutTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimeoutType ElementName: xsd:nonNegativeInteger ElementType : blocking-timeout-millis
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>blocking-timeout-millis</code> element
    * @param blockingTimeoutMillis the value for the element <code>blocking-timeout-millis</code> 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> blockingTimeoutMillis(Integer blockingTimeoutMillis)
   {
      childNode.getOrCreate("blocking-timeout-millis").text(blockingTimeoutMillis);
      return this;
   }

   /**
    * Returns the <code>blocking-timeout-millis</code> element
    * @return the node defined for the element <code>blocking-timeout-millis</code> 
    */
   public Integer getBlockingTimeoutMillis()
   {
      if (childNode.getTextValueForPatternName("blocking-timeout-millis") != null && !childNode.getTextValueForPatternName("blocking-timeout-millis").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("blocking-timeout-millis"));
      }
      return null;
   }

   /**
    * Removes the <code>blocking-timeout-millis</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> removeBlockingTimeoutMillis()
   {
      childNode.removeChildren("blocking-timeout-millis");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimeoutType ElementName: xsd:nonNegativeInteger ElementType : idle-timeout-minutes
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>idle-timeout-minutes</code> element
    * @param idleTimeoutMinutes the value for the element <code>idle-timeout-minutes</code> 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> idleTimeoutMinutes(Integer idleTimeoutMinutes)
   {
      childNode.getOrCreate("idle-timeout-minutes").text(idleTimeoutMinutes);
      return this;
   }

   /**
    * Returns the <code>idle-timeout-minutes</code> element
    * @return the node defined for the element <code>idle-timeout-minutes</code> 
    */
   public Integer getIdleTimeoutMinutes()
   {
      if (childNode.getTextValueForPatternName("idle-timeout-minutes") != null && !childNode.getTextValueForPatternName("idle-timeout-minutes").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("idle-timeout-minutes"));
      }
      return null;
   }

   /**
    * Removes the <code>idle-timeout-minutes</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> removeIdleTimeoutMinutes()
   {
      childNode.removeChildren("idle-timeout-minutes");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimeoutType ElementName: xsd:nonNegativeInteger ElementType : allocation-retry
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>allocation-retry</code> element
    * @param allocationRetry the value for the element <code>allocation-retry</code> 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> allocationRetry(Integer allocationRetry)
   {
      childNode.getOrCreate("allocation-retry").text(allocationRetry);
      return this;
   }

   /**
    * Returns the <code>allocation-retry</code> element
    * @return the node defined for the element <code>allocation-retry</code> 
    */
   public Integer getAllocationRetry()
   {
      if (childNode.getTextValueForPatternName("allocation-retry") != null && !childNode.getTextValueForPatternName("allocation-retry").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("allocation-retry"));
      }
      return null;
   }

   /**
    * Removes the <code>allocation-retry</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> removeAllocationRetry()
   {
      childNode.removeChildren("allocation-retry");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimeoutType ElementName: xsd:nonNegativeInteger ElementType : allocation-retry-wait-millis
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>allocation-retry-wait-millis</code> element
    * @param allocationRetryWaitMillis the value for the element <code>allocation-retry-wait-millis</code> 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> allocationRetryWaitMillis(Integer allocationRetryWaitMillis)
   {
      childNode.getOrCreate("allocation-retry-wait-millis").text(allocationRetryWaitMillis);
      return this;
   }

   /**
    * Returns the <code>allocation-retry-wait-millis</code> element
    * @return the node defined for the element <code>allocation-retry-wait-millis</code> 
    */
   public Integer getAllocationRetryWaitMillis()
   {
      if (childNode.getTextValueForPatternName("allocation-retry-wait-millis") != null && !childNode.getTextValueForPatternName("allocation-retry-wait-millis").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("allocation-retry-wait-millis"));
      }
      return null;
   }

   /**
    * Removes the <code>allocation-retry-wait-millis</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> removeAllocationRetryWaitMillis()
   {
      childNode.removeChildren("allocation-retry-wait-millis");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimeoutType ElementName: xsd:nonNegativeInteger ElementType : xa-resource-timeout
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>xa-resource-timeout</code> element
    * @param xaResourceTimeout the value for the element <code>xa-resource-timeout</code> 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> xaResourceTimeout(Integer xaResourceTimeout)
   {
      childNode.getOrCreate("xa-resource-timeout").text(xaResourceTimeout);
      return this;
   }

   /**
    * Returns the <code>xa-resource-timeout</code> element
    * @return the node defined for the element <code>xa-resource-timeout</code> 
    */
   public Integer getXaResourceTimeout()
   {
      if (childNode.getTextValueForPatternName("xa-resource-timeout") != null && !childNode.getTextValueForPatternName("xa-resource-timeout").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("xa-resource-timeout"));
      }
      return null;
   }

   /**
    * Removes the <code>xa-resource-timeout</code> element 
    * @return the current instance of <code>TimeoutType<T></code> 
    */
   public TimeoutType<T> removeXaResourceTimeout()
   {
      childNode.removeChildren("xa-resource-timeout");
      return this;
   }
}
