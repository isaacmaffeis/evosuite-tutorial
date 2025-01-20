package org.evoservice.pillbox;
// Pillbox_1.java automatically generated from ASM2CODE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;

class Pillbox_1 {
	/////////////////////////////////////////////////
/// DOMAIN CONTAINERS
/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo Concreto o Enumerativo
	enum LedLights {
		OFF, ON, BLINKING
	}

	List<LedLights> LedLights_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum OutMessages {
		TAKE_PILL, NONE, PILL_MISSED, DRAWER_NOT_CLOSED, CLOSE_DRAWER_IN_10_MIN, TAKE_PILL_IN_10_MIN
	}

	List<OutMessages> OutMessages_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	static class Time {
		private static List<Integer> elems = new ArrayList<>();
		Integer value;

		static Time valueOf(Integer val) {
			Time n = new Time();
			n.value = val;
			return n;
		}

		static Time valueOf(Time val) {
			return val;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Time))
				return false;
			return value.equals(((Time) obj).value);
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}
	}

	Time Time_elem = new Time();
	List<Integer> Time_elems = new ArrayList<>();

	//Metodi di supporto per l'implementazione delle funzioni controlled
	class Fun0Ctrl<D> {
		D oldValue;
		D newValue;

		void set(D d) {
			newValue = d;
		}

		D get() {
			return oldValue;
		}
	}

	static class FunNCtrl<D, C> {
		Map<D, C> oldValues = new HashMap<>();
		Map<D, C> newValues = new HashMap<>();

		void set(D d, C c) {
			newValues.put(d, c);
		}

		C get(D d) {
			return oldValues.get(d);
		}
	}

	//Metodi di supporto per l'implementazione delle funzioni non controlled
	class Fun0<D> {
		D value;

		void set(D d) {
			value = d;
		}

		D get() {
			return value;
		}
	}

	class FunN<D, C> {
		Map<D, C> values = new HashMap<>();

		void set(D d, C c) {
			values.put(d, c);
		}

		C get(D d) {
			return values.get(d);
		}
	}

	/////////////////////////////////////////////////
/// FUNCTIONS
/////////////////////////////////////////////////
	//Funzione di tipo monitored
	Fun0<Boolean> openSwitch = new Fun0<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<Boolean> opened = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<LedLights> redLed = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<OutMessages> outMess = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<OutMessages> logMess = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<Time> time_consumption = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<Boolean> requestSatisfied = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<Time> systemTime = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<Time> drawerTimer = new Fun0Ctrl<>();

	//Funzione di tipo statico
	// Inizializzazione di funzioni e domini
	Pillbox_1() {
		//Definizione iniziale dei domini statici
		Time.elems = Collections.unmodifiableList(
				Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23));
		Time_elems = Collections.unmodifiableList(
				Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23));
		LedLights_elemsList = Collections
				.unmodifiableList(Arrays.asList(LedLights.OFF, LedLights.ON, LedLights.BLINKING));
		OutMessages_elemsList = Collections.unmodifiableList(Arrays.asList(OutMessages.TAKE_PILL, OutMessages.NONE,
				OutMessages.PILL_MISSED, OutMessages.DRAWER_NOT_CLOSED, OutMessages.CLOSE_DRAWER_IN_10_MIN,
				OutMessages.TAKE_PILL_IN_10_MIN));
		//Definizione iniziale dei domini dinamici
		//Definizione iniziale dei domini astratti con funzini statiche
		//Inizializzazione delle funzioni
		opened.oldValue = opened.newValue = false;
		outMess.oldValue = outMess.newValue = OutMessages.NONE;
		logMess.oldValue = logMess.newValue = OutMessages.NONE;
		redLed.oldValue = redLed.newValue = LedLights.OFF;
		Time_elem.value = 0;
		drawerTimer.oldValue = drawerTimer.newValue = Time.valueOf(0);
		Time_elem.value = 1;
		time_consumption.oldValue = time_consumption.newValue = Time_elem;
		Time_elem.value = 0;
		systemTime.oldValue = systemTime.newValue = Time_elem;
		requestSatisfied.oldValue = requestSatisfied.newValue = false;
	}

	// Definizione delle funzioni statiche
	Time tenMinutes() {
		Time supp = new Time();
		supp.value = 1;
		return supp;
	}

	// Conversione delle regole ASM in metodi java
	boolean branch_r_writeToFile_master = false;

	void r_writeToFile() {
		branch_r_writeToFile_master = true;
		// Empty rule 
	}

	boolean branch_r_pillToBeTaken_master = false;
	boolean branch_r_pillToBeTaken_1 = false;

	void r_pillToBeTaken() {
		branch_r_pillToBeTaken_master = true;
		//{ //par
		if (Boolean.TRUE.equals((redLed.get() != LedLights.ON))) {
			branch_r_pillToBeTaken_1 = true;
			Time Time_s = new Time();
			Time_s.value = (//drawerTimer.get().value
			systemTime.get().value);
			drawerTimer.set(Time_s);
		}
		redLed.set(LedLights.ON);
		outMess.set(OutMessages.TAKE_PILL);
		//} //endpar
	}

	boolean branch_r_drawerOpened_master = false;
	boolean branch_r_drawerOpened_1 = false;

	void r_drawerOpened() {
		branch_r_drawerOpened_master = true;
		//{ //par
		if (Boolean.TRUE.equals(
				(redLed.get() != LedLights.BLINKING) && (outMess.get() != OutMessages.CLOSE_DRAWER_IN_10_MIN))) {
			branch_r_drawerOpened_1 = true;
			Time Time_s = new Time();
			Time_s.value = (//drawerTimer.get().value
			systemTime.get().value);
			drawerTimer.set(Time_s);
		}
		redLed.set(LedLights.BLINKING);
		outMess.set(OutMessages.CLOSE_DRAWER_IN_10_MIN);
		//} //endpar
	}

	boolean branch_r_pillTaken_drawerOpened_master = false;

	void r_pillTaken_drawerOpened() {
		branch_r_pillTaken_drawerOpened_master = true;
		//{ //par
		redLed.set(LedLights.OFF);
		outMess.set(OutMessages.NONE);
		Time Time_s = new Time();
		Time_s.value = (//drawerTimer.get().value
		systemTime.get().value);
		drawerTimer.set(Time_s);
		requestSatisfied.set(true);
		//} //endpar
	}

	boolean branch_r_drawerClosed_master = false;

	void r_drawerClosed() {
		branch_r_drawerClosed_master = true;
		//{ //par
		redLed.set(LedLights.OFF);
		outMess.set(OutMessages.NONE);
		Time Time_s = new Time();
		Time_s.value = (//drawerTimer.get().value
		systemTime.get().value);
		drawerTimer.set(Time_s);
		requestSatisfied.set(true);
		//} //endpar
	}

	boolean branch_r_timeOutExpired_missedPill_master = false;

	void r_timeOutExpired_missedPill() {
		branch_r_timeOutExpired_missedPill_master = true;
		//{ //par
		redLed.set(LedLights.OFF);
		outMess.set(OutMessages.NONE);
		logMess.set(OutMessages.PILL_MISSED);
		Time Time_s = new Time();
		Time_s.value = (//drawerTimer.get().value
		systemTime.get().value);
		drawerTimer.set(Time_s);
		requestSatisfied.set(true);
		r_writeToFile();
		//} //endpar
	}

	boolean branch_r_timeOutExpired_drawerOpened_master = false;

	void r_timeOutExpired_drawerOpened() {
		branch_r_timeOutExpired_drawerOpened_master = true;
		//{ //par
		redLed.set(LedLights.OFF);
		outMess.set(OutMessages.NONE);
		logMess.set(OutMessages.DRAWER_NOT_CLOSED);
		Time Time_s = new Time();
		Time_s.value = (//drawerTimer.get().value
		systemTime.get().value);
		drawerTimer.set(Time_s);
		requestSatisfied.set(true);
		r_writeToFile();
		//} //endpar
	}

	boolean branch_r_takeInTimeout_master = false;
	boolean branch_r_takeInTimeout_1 = false;

	void r_takeInTimeout() {
		branch_r_takeInTimeout_master = true;
		//{ //par
		if (Boolean.TRUE
				.equals((redLed.get() != LedLights.BLINKING) && (outMess.get() != OutMessages.TAKE_PILL_IN_10_MIN))) {
			branch_r_takeInTimeout_1 = true;
			Time Time_s = new Time();
			Time_s.value = (//drawerTimer.get().value
			systemTime.get().value);
			drawerTimer.set(Time_s);
		}
		redLed.set(LedLights.BLINKING);
		outMess.set(OutMessages.TAKE_PILL_IN_10_MIN);
		//} //endpar
	}

	boolean branch_r_Main_master = false;
	boolean branch_r_Main_1 = false;
	boolean branch_r_Main_2 = false;
	boolean branch_r_Main_3 = false;
	boolean branch_r_Main_4 = false;
	boolean branch_r_Main_5 = false;
	boolean branch_r_Main_6 = false;
	boolean branch_r_Main_7 = false;
	boolean branch_r_Main_8 = false;
	boolean branch_r_Main_9 = false;
	boolean branch_r_Main_10 = false;
	boolean branch_r_Main_11 = false;
	boolean branch_r_Main_12 = false;
	boolean branch_r_Main_13 = false;
	boolean branch_r_Main_14 = false;
	boolean branch_r_Main_15 = false;
	boolean branch_r_Main_16 = false;
	boolean branch_r_Main_17 = false;
	boolean branch_r_Main_18 = false;
	boolean branch_r_Main_19 = false;
	boolean branch_r_Main_20 = false;

	void r_Main() {
		branch_r_Main_master = true;
		if (Boolean.TRUE.equals(!requestSatisfied.get() && (systemTime.get().value < 24))) {
			branch_r_Main_1 = true;
			//{ //par
			Time Time1494277749_s = new Time();
			Time1494277749_s.value = (//systemTime.get().value
			((systemTime.get().value + 1) % 24));
			systemTime.set(Time1494277749_s);
			if (Boolean.TRUE.equals(!opened.get() && openSwitch.get())) {
				branch_r_Main_2 = true;
				opened.set(true);
			}
			if (Boolean.TRUE.equals(opened.get() && !openSwitch.get())) {
				branch_r_Main_3 = true;
				opened.set(false);
			}
			if (Boolean.TRUE.equals((redLed.get() == LedLights.OFF))) {
				branch_r_Main_4 = true;
				if (Boolean.TRUE
						.equals((time_consumption.get().value <= systemTime.get().value) && !requestSatisfied.get())) {
					branch_r_Main_5 = true;
					r_pillToBeTaken();
				}
			}
			if (Boolean.TRUE.equals((redLed.get() == LedLights.ON)
					&& !((systemTime.get().value - drawerTimer.get().value) >= tenMinutes().value) && opened.get()
					&& !openSwitch.get())) {
				branch_r_Main_6 = true;
				r_pillTaken_drawerOpened();
			}
			if (Boolean.TRUE.equals((redLed.get() == LedLights.ON) && !opened.get() && openSwitch.get())) {
				branch_r_Main_7 = true;
				r_drawerOpened();
			}
			if (Boolean.TRUE.equals((redLed.get() == LedLights.ON))) {
				branch_r_Main_8 = true;
				if (Boolean.TRUE.equals(((systemTime.get().value - drawerTimer.get().value) >= tenMinutes().value))) {
					branch_r_Main_9 = true;
					if (Boolean.TRUE.equals(opened.get())) {
						branch_r_Main_10 = true;
						r_drawerOpened();
					} else {
						branch_r_Main_11 = true;
						if (Boolean.TRUE.equals(!openSwitch.get())) {
							branch_r_Main_12 = true;
							r_takeInTimeout();
						}
					}
				}
			}
			if (Boolean.TRUE.equals((redLed.get() == LedLights.BLINKING))) {
				branch_r_Main_13 = true;
				if (Boolean.TRUE.equals(!openSwitch.get() && opened.get())) {
					branch_r_Main_14 = true;
					r_drawerClosed();
				} else {
					branch_r_Main_15 = true;
					if (Boolean.TRUE
							.equals(((systemTime.get().value - drawerTimer.get().value) > tenMinutes().value))) {
						branch_r_Main_16 = true;
						if (Boolean.TRUE.equals(openSwitch.get())) {
							branch_r_Main_17 = true;
							r_timeOutExpired_drawerOpened();
						} else {
							branch_r_Main_18 = true;
							r_timeOutExpired_missedPill();
						}
					} else {
						branch_r_Main_19 = true;
						if (Boolean.TRUE.equals(openSwitch.get())) {
							branch_r_Main_20 = true;
							r_drawerOpened();
						}
					}
				}
			}
			//} //endpar
		}
	}

	// inizializazzione delle funzioni controllate che contengono metodi monitorati nei temini iniziali
	void initControlledWithMonitored() {
		// No controlled functions initialized with monitored ones have been found
	}

	// applicazione dell'aggiornamento del set
	void fireUpdateSet() {
		opened.oldValue = opened.newValue;
		redLed.oldValue = redLed.newValue;
		outMess.oldValue = outMess.newValue;
		logMess.oldValue = logMess.newValue;
		time_consumption.oldValue = time_consumption.newValue;
		requestSatisfied.oldValue = requestSatisfied.newValue;
		systemTime.oldValue = systemTime.newValue;
		drawerTimer.oldValue = drawerTimer.newValue;
	}

	//Metodo per l'aggiornamento dell'asm
	void updateASM() {
		r_Main();
		fireUpdateSet();
		initControlledWithMonitored();
	}
}
