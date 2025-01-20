package domaintests;

import domaintests.EnumTD.EnumDomain;
import org.junit.Test;

public class EnumDomainTest {

  @Test
  public void testEnumDomain(){

      EnumTD_ATG enumTD_ATG = new EnumTD_ATG();

      enumTD_ATG.set_enumMonitoredFunction(EnumTD.EnumDomain.STATE1);

      enumTD_ATG.set_enumtoenumMonitoredFunction_STATE1(EnumDomain.STATE1);

      enumTD_ATG.set_anotherEnumtoenumMonitoredFunction_ON(EnumDomain.STATE1);

      System.out.println("enum [] -> : " + enumTD_ATG.get_enumControlledFunction());

      System.out.println("enum : AnotherEnum -> EnumDomain : " + enumTD_ATG.get_anotherEnumtoenumControlledFunction_STATE1());

      System.out.println("enum : EnumDomain -> EnumDomain : " + enumTD_ATG.get_enumtoenumControlledFunction_STATE1());

  }

}
