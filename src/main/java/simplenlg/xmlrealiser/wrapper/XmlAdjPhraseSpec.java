//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.04 at 09:14:07 AM EST 
//


package simplenlg.xmlrealiser.wrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjPhraseSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjPhraseSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{https://github.com/simplenlg/simplenlg/tree/master/src/main/resources/xml}PhraseElement">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{https://github.com/simplenlg/simplenlg/tree/master/src/main/resources/xml}adjAdvPhraseAtts"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjPhraseSpec")
public class XmlAdjPhraseSpec
    extends XmlPhraseElement
{

    @XmlAttribute(name = "IS_COMPARATIVE")
    protected Boolean iscomparative;
    @XmlAttribute(name = "IS_SUPERLATIVE")
    protected Boolean issuperlative;

    /**
     * Gets the value of the iscomparative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISCOMPARATIVE() {
        return iscomparative;
    }

    /**
     * Sets the value of the iscomparative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISCOMPARATIVE(Boolean value) {
        this.iscomparative = value;
    }

    /**
     * Gets the value of the issuperlative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISSUPERLATIVE() {
        return issuperlative;
    }

    /**
     * Sets the value of the issuperlative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISSUPERLATIVE(Boolean value) {
        this.issuperlative = value;
    }

}
