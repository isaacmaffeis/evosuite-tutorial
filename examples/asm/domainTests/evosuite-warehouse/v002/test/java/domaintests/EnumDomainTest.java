package domaintests;

import org.junit.Test;

public class EnumDomainTest {

  @Test
  public void testEnumDomain(){

      EnumTD_ATG enumTD_ATG = new EnumTD_ATG();

      enumTD_ATG.set_enumMonitoredFunction(EnumTD.EnumDomain.STATE1);

      enumTD_ATG.set_enumtoenumMonitoredFunction_STATE1(EnumTD.EnumDomain.STATE1);

      enumTD_ATG.set_anotherEnumtoenumMonitoredFunction_ON(EnumTD.EnumDomain.STATE1);

      enumTD_ATG.set_enumtointegerMonitoredFunction_STATE1(15);

      enumTD_ATG.set_enumtostringMonitoredFunction_STATE1("test");

      enumTD_ATG.set_enumtobooleanMonitoredFunction_STATE1(true);

      enumTD_ATG.set_enumtoabstractMonitoredFunction_STATE1("value1");

      System.out.println("enum [] -> : " + enumTD_ATG.get_enumControlledFunction());

      System.out.println("enum : AnotherEnum -> EnumDomain : " + enumTD_ATG.get_anotherEnumtoenumControlledFunction_STATE1());

      System.out.println("enum : EnumDomain -> EnumDomain : " + enumTD_ATG.get_enumtoenumControlledFunction_STATE1());

      System.out.println("enum : EnumDomain -> Integer : " + enumTD_ATG.get_enumtointegerControlledFunction_STATE1());

      System.out.println("enum : EnumDomain -> String : " + enumTD_ATG.get_enumtostringControlledFunction_STATE1());

      System.out.println("enum : EnumDomain -> Boolean : " + enumTD_ATG.get_enumtobooleanControlledFunction_STATE1());

      System.out.println("enum : EnumDomain -> Abstract : " + enumTD_ATG.get_enumtoabstractControlledFunction_STATE2());


  }

}
