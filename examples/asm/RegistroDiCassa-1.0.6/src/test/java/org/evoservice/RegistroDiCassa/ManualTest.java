package org.evoservice.RegistroDiCassa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ManualTest {

  @Test
  public void test(){

    RegistroDiCassa_TestGen registroDiCassaTestGen = new RegistroDiCassa_TestGen();
    assertEquals(registroDiCassaTestGen.get_statoCassa(), RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI);

    registroDiCassaTestGen.set_servizioSelezionato(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Servizio.NEWORDINE);
    registroDiCassaTestGen.step();
    assertEquals(registroDiCassaTestGen.get_statoCassa(), RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA);

  }

}
