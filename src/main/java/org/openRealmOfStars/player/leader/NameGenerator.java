package org.openRealmOfStars.player.leader;

import org.openRealmOfStars.player.SpaceRace.SpaceRace;
import org.openRealmOfStars.utilities.DiceGenerator;

/**
*
* Open Realm of Stars game project
* Copyright (C) 2020 Tuomo Untinen
*
* This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU General Public License
* as published by the Free Software Foundation; either version 2
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, see http://www.gnu.org/licenses/
*
*
* Leader Name Generator.
*
*/
public final class NameGenerator {

  /**
   * Just hiding the constructor.
   */
  private NameGenerator() {
    // Nothing to do.
  }

  /**
   * Generate Teuthidae leader name
   * @param gender Leader gender
   * @return Teuthidae leader name
   */
  private static String generateTeuthidaeName(final Gender gender) {
    StringBuilder sb = new StringBuilder();
    switch (DiceGenerator.getRandom(62)) {
      default:
      case 0: sb.append("Abh"); break;
      case 1: sb.append("Al"); break;
      case 2: sb.append("Amm"); break;
      case 3: sb.append("Ap"); break;
      case 4: sb.append("Arw"); break;
      case 5: sb.append("B'gn"); break;
      case 6: sb.append("D"); break;
      case 7: sb.append("Ayi'"); break;
      case 8: sb.append("Ayl"); break;
      case 9: sb.append("Coat"); break;
      case 10: sb.append("Cth"); break;
      case 11: sb.append("Ei'"); break;
      case 12: sb.append("Has"); break;
      case 13: sb.append("H'ctht"); break;
      case 14: sb.append("Grot"); break;
      case 15: sb.append("Gol"); break;
      case 16: sb.append("Gwar"); break;
      case 17: sb.append("Io"); break;
      case 18: sb.append("Ist"); break;
      case 19: sb.append("Ith'"); break;
      case 20: sb.append("Kaun"); break;
      case 21: sb.append("J"); break;
      case 22: sb.append("Khal'"); break;
      case 23: sb.append("Kass"); break;
      case 24: sb.append("K'nar"); break;
      case 25: sb.append("Kra"); break;
      case 26: sb.append("Lyth"); break;
      case 27: sb.append("M'"); break;
      case 28: sb.append("Mnom"); break;
      case 29: sb.append("Mor"); break;
      case 30: sb.append("Mort"); break;
      case 31: sb.append("Ngir"); break;
      case 32: sb.append("Nycr"); break;
      case 33: sb.append("Phar'"); break;
      case 34: sb.append("Quac"); break;
      case 35: sb.append("Quy"); break;
      case 36: sb.append("Q'"); break;
      case 37: sb.append("Rag"); break;
      case 38: sb.append("Rap"); break;
      case 39: sb.append("Raan"); break;
      case 40: sb.append("Rhog"); break;
      case 41: sb.append("Scat"); break;
      case 42: sb.append("Shak"); break;
      case 43: sb.append("Shat"); break;
      case 44: sb.append("Sheb"); break;
      case 45: sb.append("S't"); break;
      case 46: sb.append("Than"); break;
      case 47: sb.append("T'"); break;
      case 48: sb.append("Th'"); break;
      case 49: sb.append("Uit"); break;
      case 50: sb.append("Ut'"); break;
      case 51: sb.append("Vhuz"); break;
      case 52: sb.append("Vib"); break;
      case 53: sb.append("Vth"); break;
      case 54: sb.append("Vult"); break;
      case 55: sb.append("Xal"); break;
      case 56: sb.append("Xot"); break;
      case 57: sb.append("Yam"); break;
      case 58: sb.append("Y'"); break;
      case 59: sb.append("Zat"); break;
      case 60: sb.append("Zin"); break;
      case 61: sb.append("Zus"); break;
      case 62: sb.append("Z'"); break;
    }
    if (DiceGenerator.getRandom(3) == 0) {
      switch (DiceGenerator.getRandom(19)) {
        default:
        case 0: sb.append("uts"); break;
        case 1: sb.append("ag"); break;
        case 2: sb.append("og"); break;
        case 3: sb.append("lic"); break;
        case 4: sb.append("eghy"); break;
        case 5: sb.append("yll"); break;
        case 6: sb.append("ull"); break;
        case 7: sb.append("tele"); break;
        case 8: sb.append("oth"); break;
        case 9: sb.append("zoth"); break;
        case 10: sb.append("anai'"); break;
        case 11: {
          if (!sb.toString().endsWith("'")) {
            sb.append("'");
          }
          break;
        }
        case 12: sb.append("o"); break;
        case 13: sb.append("bas"); break;
        case 14: sb.append("digg"); break;
        case 15: sb.append("ll"); break;
        case 16: sb.append("rth'"); break;
        case 17: sb.append("a"); break;
        case 18: sb.append("hana"); break;
        case 19: sb.append("h"); break;
        case 20: sb.append("lat"); break;
        case 21: sb.append("zil"); break;
        case 22: sb.append("aril"); break;
        case 23: sb.append("gol"); break;
        case 24: sb.append("dar"); break;
        case 25: sb.append("togg"); break;
        case 26: sb.append("sha"); break;
      }
    }
    switch (DiceGenerator.getRandom(59)) {
      default:
      case 0: sb.append("olos"); break;
      case 1: sb.append("ala"); break;
      case 2: sb.append("eba"); break;
      case 3: sb.append("oom"); break;
      case 4: sb.append("assa"); break;
      case 5: sb.append("u"); break;
      case 6: sb.append("on"); break;
      case 7: sb.append("ig"); break;
      case 8: sb.append("ith"); break;
      case 9: sb.append("at"); break;
      case 10: sb.append("at"); break;
      case 11: sb.append("a"); break;
      case 12: sb.append("lor"); break;
      case 13: sb.append("tur"); break;
      case 14: sb.append("goth"); break;
      case 15: sb.append("h"); break;
      case 16: sb.append("ess"); break;
      case 17: sb.append("loth"); break;
      case 18: sb.append("d"); break;
      case 19: sb.append("asha"); break;
      case 20: sb.append("aqua"); break;
      case 21: sb.append("ngo"); break;
      case 22: sb.append("kru"); break;
      case 23: sb.append("gtha"); break;
      case 24: sb.append("st"); break;
      case 25: sb.append("ng"); break;
      case 26: sb.append("alia"); break;
      case 27: sb.append("ui"); break;
      case 28: sb.append("quan"); break;
      case 29: sb.append("ian"); break;
      case 30: sb.append("gh"); break;
      case 31: sb.append("lu"); break;
      case 32: sb.append("ma"); break;
      case 33: sb.append("ol'"); break;
      case 34: sb.append("hil"); break;
      case 35: sb.append("gen"); break;
      case 36: sb.append("yth"); break;
      case 37: sb.append("nalla"); break;
      case 38: sb.append("suan"); break;
      case 39: sb.append("og"); break;
      case 40: sb.append("ach"); break;
      case 41: sb.append("al"); break;
      case 43: sb.append("hak"); break;
      case 44: sb.append("ya"); break;
      case 45: sb.append("aroa"); break;
      case 46: sb.append("apac"); break;
      case 47: sb.append("uit"); break;
      case 48: sb.append("ulls"); break;
      case 49: sb.append("ompha"); break;
      case 50: sb.append("ur"); break;
      case 51: sb.append("ops"); break;
      case 52: sb.append("afu"); break;
      case 53: sb.append("li"); break;
      case 54: sb.append("ath"); break;
      case 55: sb.append("onac"); break;
      case 56: sb.append("hog"); break;
      case 57: sb.append("ak"); break;
      case 58: sb.append("on"); break;
      case 59: sb.append("ua"); break;
    }
    if (DiceGenerator.getRandom(3) == 0) {
      // Extra name with dash
      sb.append("-");
      switch (DiceGenerator.getRandom(24)) {
        default:
        case 0: sb.append("Al"); break;
        case 1: sb.append("Ap"); break;
        case 2: sb.append("Ayl"); break;
        case 3: sb.append("Cot"); break;
        case 4: sb.append("Er"); break;
        case 5: sb.append("Hus"); break;
        case 6: sb.append("Gor"); break;
        case 7: sb.append("Gar"); break;
        case 8: sb.append("Ith"); break;
        case 9: sb.append("Ker"); break;
        case 10: sb.append("Kar"); break;
        case 11: sb.append("Lyn"); break;
        case 12: sb.append("Mor"); break;
        case 13: sb.append("Nir"); break;
        case 14: sb.append("Omm"); break;
        case 15: sb.append("Rer"); break;
        case 16: sb.append("Ran"); break;
        case 17: sb.append("Ser"); break;
        case 18: sb.append("Teg"); break;
        case 19: sb.append("Ur"); break;
        case 20: sb.append("Vhuz"); break;
        case 21: sb.append("Vyr"); break;
        case 22: sb.append("Xun"); break;
        case 23: sb.append("Yr"); break;
        case 24: sb.append("Zur"); break;
      }
      switch (DiceGenerator.getRandom(13)) {
        default:
        case 0: sb.append("ath"); break;
        case 1: sb.append("og"); break;
        case 2: sb.append("ha"); break;
        case 3: sb.append("oct"); break;
        case 4: sb.append("er"); break;
        case 5: sb.append("oth"); break;
        case 6: sb.append("ai"); break;
        case 7: sb.append("ya"); break;
        case 8: sb.append("or"); break;
        case 9: sb.append("ash"); break;
        case 10: sb.append("un"); break;
        case 11: sb.append("loth"); break;
        case 12: sb.append("ugn"); break;
        case 13: sb.append("olka"); break;
      }
    }

    sb.append(" ");
    // Surname part
    switch (DiceGenerator.getRandom(31)) {
      default:
      case 0: sb.append("Abho"); break;
      case 1: sb.append("Ala"); break;
      case 2: sb.append("Ammut"); break;
      case 3: sb.append("Arw"); break;
      case 4: sb.append("Apocolot"); break;
      case 5: sb.append("Bya"); break;
      case 6: sb.append("Coin"); break;
      case 7: sb.append("Cthu"); break;
      case 8: sb.append("Dhu"); break;
      case 9: sb.append("Egni"); break;
      case 10: sb.append("Glee"); break;
      case 11: sb.append("Gol"); break;
      case 12: sb.append("Inpen"); break;
      case 13: sb.append("Kassoh"); break;
      case 14: sb.append("Khal"); break;
      case 15: sb.append("Lyth"); break;
      case 16: sb.append("Nom"); break;
      case 17: sb.append("Mort"); break;
      case 18: sb.append("Nyagh"); break;
      case 19: sb.append("Oorn"); break;
      case 20: sb.append("Pos"); break;
      case 21: sb.append("Rhogog"); break;
      case 22: sb.append("Shat"); break;
      case 23: sb.append("Sho"); break;
      case 24: sb.append("Shu"); break;
      case 25: sb.append("Thara"); break;
      case 26: sb.append("Toth"); break;
      case 27: sb.append("Vuz"); break;
      case 28: sb.append("Xala"); break;
      case 29: sb.append("Xit"); break;
      case 30: sb.append("Yhag"); break;
      case 31: sb.append("Ythogt"); break;
    }
    // Gender is mentioned in last syllable of surname
    if (gender == Gender.MALE) {
      if (sb.toString().endsWith("t")) {
        sb.append("ha");
      } else if (sb.toString().endsWith("th")) {
        sb.append("a");
      } else {
        sb.append("tha");
      }
    }
    if (gender == Gender.FEMALE) {
      if (sb.toString().endsWith("h")) {
        sb.append("oth");
      } else {
        sb.append("hoth");
      }
    }
    return sb.toString();
  }

  /**
   * Generate Chiraloid leader name
   * @param gender Leader gender
   * @return Chiraloid leader name
   */
  private static String generateChiraloidName(final Gender gender) {
    StringBuilder sb = new StringBuilder();
    if (gender == Gender.MALE) {
      switch (DiceGenerator.getRandom(49)) {
        default:
        case 0: sb.append("Ba"); break;
        case 1: sb.append("Ca"); break;
        case 2: sb.append("Da"); break;
        case 3: sb.append("Fa"); break;
        case 4: sb.append("Ga"); break;
        case 5: sb.append("Ha"); break;
        case 6: sb.append("Ja"); break;
        case 7: sb.append("Ka"); break;
        case 8: sb.append("La"); break;
        case 9: sb.append("Ma"); break;
        case 10: sb.append("Na"); break;
        case 11: sb.append("Pa"); break;
        case 12: sb.append("Ra"); break;
        case 13: sb.append("Sa"); break;
        case 14: sb.append("Ta"); break;
        case 15: sb.append("Va"); break;
        case 16: sb.append("Wa"); break;
        case 17: sb.append("Xa"); break;
        case 18: sb.append("Za"); break;
        case 19: sb.append("Be"); break;
        case 20: sb.append("Ce"); break;
        case 21: sb.append("De"); break;
        case 22: sb.append("Fe"); break;
        case 23: sb.append("Ge"); break;
        case 24: sb.append("He"); break;
        case 25: sb.append("Je"); break;
        case 26: sb.append("Ke"); break;
        case 27: sb.append("Le"); break;
        case 28: sb.append("Me"); break;
        case 29: sb.append("Ne"); break;
        case 30: sb.append("Pe"); break;
        case 31: sb.append("Re"); break;
        case 32: sb.append("Se"); break;
        case 33: sb.append("Te"); break;
        case 34: sb.append("Ve"); break;
        case 35: sb.append("We"); break;
        case 36: sb.append("Xe"); break;
        case 37: sb.append("Ze"); break;
        case 38: sb.append("Bro"); break;
        case 39: sb.append("Cro"); break;
        case 40: sb.append("Dro"); break;
        case 41: sb.append("Fro"); break;
        case 42: sb.append("Gro"); break;
        case 43: sb.append("Kra"); break;
        case 44: sb.append("Sra"); break;
        case 45: sb.append("Tra"); break;
        case 46: sb.append("Vra"); break;
        case 47: sb.append("Wra"); break;
        case 48: sb.append("Xra"); break;
        case 49: sb.append("Zro"); break;
      }
      switch (DiceGenerator.getRandom(19)) {
        default:
        case 0: sb.append("rd"); break;
        case 1: sb.append("h"); break;
        case 2: sb.append("zud"); break;
        case 3: sb.append("kiot"); break;
        case 4: sb.append("nilth"); break;
        case 5: sb.append("vos"); break;
        case 6: sb.append("vu"); break;
        case 7: sb.append("l"); break;
        case 8: sb.append("r"); break;
        case 9: sb.append("dird"); break;
        case 10: sb.append("geh"); break;
        case 11: sb.append("nura"); break;
        case 12: sb.append("los"); break;
        case 13: sb.append("vad"); break;
        case 14: sb.append("fi"); break;
        case 15: sb.append("var"); break;
        case 16: sb.append("st"); break;
        case 17: sb.append("tal"); break;
        case 18: sb.append("ka"); break;
        case 19: sb.append("gon"); break;
        case 20: sb.append("tu"); break;
        case 21: sb.append("zard"); break;
        case 22: sb.append("ria"); break;
        case 23: sb.append("s"); break;
        case 24: sb.append("dis"); break;
        case 25: sb.append("fit"); break;
        case 26: sb.append("dor"); break;
        case 27: sb.append("dudor"); break;
        case 28: sb.append("dador"); break;
        case 29: sb.append("vudor"); break;
        case 30: sb.append("xedar"); break;
        case 31: sb.append("max"); break;
        case 32: sb.append("vur"); break;
        case 33: sb.append("cust"); break;
        case 34: sb.append("rust"); break;
      }
    }
    if (gender == Gender.FEMALE) {
      switch (DiceGenerator.getRandom(54)) {
        default:
        case 0: sb.append("Ba"); break;
        case 1: sb.append("Ca"); break;
        case 2: sb.append("Da"); break;
        case 3: sb.append("Fa"); break;
        case 4: sb.append("Ga"); break;
        case 5: sb.append("Ha"); break;
        case 6: sb.append("Ja"); break;
        case 7: sb.append("Ka"); break;
        case 8: sb.append("La"); break;
        case 9: sb.append("Ma"); break;
        case 10: sb.append("Na"); break;
        case 11: sb.append("Pa"); break;
        case 12: sb.append("Ra"); break;
        case 13: sb.append("Sa"); break;
        case 14: sb.append("Ta"); break;
        case 15: sb.append("Va"); break;
        case 16: sb.append("Wa"); break;
        case 17: sb.append("Xa"); break;
        case 18: sb.append("Za"); break;
        case 19: sb.append("Be"); break;
        case 20: sb.append("Ce"); break;
        case 21: sb.append("De"); break;
        case 22: sb.append("Fe"); break;
        case 23: sb.append("Ge"); break;
        case 24: sb.append("He"); break;
        case 25: sb.append("Je"); break;
        case 26: sb.append("Ke"); break;
        case 27: sb.append("Le"); break;
        case 28: sb.append("Me"); break;
        case 29: sb.append("Ne"); break;
        case 30: sb.append("Pe"); break;
        case 31: sb.append("Re"); break;
        case 32: sb.append("Se"); break;
        case 33: sb.append("Te"); break;
        case 34: sb.append("Ve"); break;
        case 35: sb.append("We"); break;
        case 36: sb.append("Xe"); break;
        case 37: sb.append("Ze"); break;
        case 38: sb.append("Bo"); break;
        case 39: sb.append("Co"); break;
        case 40: sb.append("Do"); break;
        case 41: sb.append("Fo"); break;
        case 42: sb.append("Go"); break;
        case 43: sb.append("Ki"); break;
        case 44: sb.append("Si"); break;
        case 45: sb.append("Te"); break;
        case 46: sb.append("Vi"); break;
        case 47: sb.append("Wi"); break;
        case 48: sb.append("Xi"); break;
        case 49: sb.append("Zi"); break;
        case 50: sb.append("Bi"); break;
        case 51: sb.append("Ci"); break;
        case 52: sb.append("Di"); break;
        case 53: sb.append("Fi"); break;
        case 54: sb.append("Gi"); break;
      }
      if (DiceGenerator.getRandom(3) == 0) {
        switch (DiceGenerator.getRandom(19)) {
          default:
          case 0: sb.append("wav"); break;
          case 1: sb.append("var"); break;
          case 2: sb.append("fov"); break;
          case 3: sb.append("rek"); break;
          case 4: sb.append("lag"); break;
          case 5: sb.append("ser"); break;
          case 6: sb.append("dev"); break;
          case 7: sb.append("wuf"); break;
          case 8: sb.append("vul"); break;
          case 9: sb.append("ses"); break;
          case 10: sb.append("nus"); break;
          case 11: sb.append("ruh"); break;
          case 12: sb.append("sef"); break;
          case 13: sb.append("mak"); break;
          case 14: sb.append("gir"); break;
          case 15: sb.append("lov"); break;
          case 16: sb.append("vir"); break;
          case 17: sb.append("gal"); break;
          case 18: sb.append("gad"); break;
          case 19: sb.append("dus"); break;
        }
      }
      switch (DiceGenerator.getRandom(19)) {
        default:
        case 0: sb.append("myl"); break;
        case 1: sb.append("li"); break;
        case 2: sb.append("ly"); break;
        case 3: sb.append("ru"); break;
        case 4: sb.append("ne"); break;
        case 5: sb.append("ra"); break;
        case 6: sb.append("wa"); break;
        case 7: sb.append("nu"); break;
        case 8: sb.append("reth"); break;
        case 9: sb.append("lu"); break;
        case 10: sb.append("ni"); break;
        case 11: sb.append("zi"); break;
        case 12: sb.append("le"); break;
        case 13: sb.append("fe"); break;
        case 14: sb.append("vun"); break;
        case 15: sb.append("nu"); break;
        case 16: sb.append("wa"); break;
        case 17: sb.append("zash"); break;
        case 18: sb.append("nish"); break;
        case 19: sb.append("fru"); break;
      }
    }
    sb.append(" ");
    switch (DiceGenerator.getRandom(20)) {
      default:
      case 0: sb.append("Dark"); break;
      case 1: sb.append("Evil"); break;
      case 2: sb.append("Radical"); break;
      case 3: sb.append("Wicked"); break;
      case 4: sb.append("Wild"); break;
      case 5: sb.append("Bloody"); break;
      case 6: sb.append("Fierce"); break;
      case 7: sb.append("Red"); break;
      case 8: sb.append("Dead"); break;
      case 9: sb.append("Odd"); break;
      case 10: sb.append("Scary"); break;
      case 11: sb.append("Flaming"); break;
      case 12: sb.append("Blazing"); break;
      case 13: sb.append("Tiny"); break;
      case 14: sb.append("Massive"); break;
      case 15: sb.append("Melted"); break;
      case 16: sb.append("Sinful"); break;
      case 17: sb.append("Spicy"); break;
      case 18: sb.append("Shady"); break;
      case 19: sb.append("Sour"); break;
      case 20: sb.append("Soul"); break;
    }
    switch (DiceGenerator.getRandom(19)) {
      default:
      case 0: sb.append("ground"); break;
      case 1: sb.append("hill"); break;
      case 2: sb.append("plant"); break;
      case 3: sb.append("rocket"); break;
      case 4: sb.append("spear"); break;
      case 5: sb.append("spirit"); break;
      case 6: sb.append("torpedo"); break;
      case 7: sb.append("bomb"); break;
      case 8: sb.append("star"); break;
      case 9: sb.append("engine"); break;
      case 10: sb.append("scoop"); break;
      case 11: sb.append("syntesis"); break;
      case 12: sb.append("land"); break;
      case 13: sb.append("armor"); break;
      case 14: sb.append("planet"); break;
      case 15: sb.append("sabre"); break;
      case 16: sb.append("crown"); break;
      case 17: sb.append("tool"); break;
      case 18: sb.append("weapon"); break;
      case 19: sb.append("scythe"); break;
    }
    return sb.toString();
  }

  /**
   * Generate spork leader name
   * @param gender Leader gender
   * @return Spork leader name
   */
  private static String generateSporkName(final Gender gender) {
    StringBuilder sb = new StringBuilder();
    if (gender == Gender.MALE) {
      switch (DiceGenerator.getRandom(19)) {
        default:
        case 0: sb.append("Bal"); break;
        case 1: sb.append("Lum"); break;
        case 2: sb.append("Rog"); break;
        case 3: sb.append("Gor"); break;
        case 4: sb.append("Bar"); break;
        case 5: sb.append("Ush"); break;
        case 6: sb.append("Mol"); break;
        case 7: sb.append("Mug"); break;
        case 8: sb.append("Ug"); break;
        case 9: sb.append("Mag"); break;
        case 10: sb.append("Yam"); break;
        case 11: sb.append("Shur"); break;
        case 12: sb.append("Kur"); break;
        case 13: sb.append("Yak"); break;
        case 14: sb.append("Sha"); break;
        case 15: sb.append("Dur"); break;
        case 16: sb.append("Gur"); break;
        case 17: sb.append("Bam"); break;
        case 18: sb.append("Mul"); break;
        case 19: sb.append("Tug"); break;
      }
      if (DiceGenerator.getRandom(3) == 0) {
        switch (DiceGenerator.getRandom(19)) {
          default:
          case 0: sb.append("al"); break;
          case 1: sb.append("um"); break;
          case 2: sb.append("og"); break;
          case 3: sb.append("or"); break;
          case 4: sb.append("ar"); break;
          case 5: sb.append("sh"); break;
          case 6: sb.append("ol"); break;
          case 7: sb.append("ug"); break;
          case 8: sb.append("or"); break;
          case 9: sb.append("ag"); break;
          case 10: sb.append("am"); break;
          case 11: sb.append("hur"); break;
          case 12: sb.append("ur"); break;
          case 13: sb.append("ak"); break;
          case 14: sb.append("ha"); break;
          case 15: sb.append("er"); break;
          case 16: sb.append("gur"); break;
          case 17: sb.append("gor"); break;
          case 18: sb.append("lum"); break;
          case 19: sb.append("bug"); break;
        }
      }
      switch (DiceGenerator.getRandom(19)) {
        default:
        case 0: sb.append("dush"); break;
        case 1: sb.append("bum"); break;
        case 2: sb.append("nar"); break;
        case 3: sb.append("lorz"); break;
        case 4: sb.append("barz"); break;
        case 5: sb.append("guk"); break;
        case 6: sb.append("mol"); break;
        case 7: sb.append("a"); break;
        case 8: sb.append("oa"); break;
        case 9: sb.append("song"); break;
        case 10: sb.append("gorn"); break;
        case 11: sb.append("zul"); break;
        case 12: sb.append("hag"); break;
        case 13: sb.append("on"); break;
        case 14: sb.append("rub"); break;
        case 15: sb.append("og"); break;
        case 16: sb.append("zat"); break;
        case 17: sb.append("mash"); break;
        case 18: sb.append("long"); break;
        case 19: sb.append("mog"); break;
      }
    }
    if (gender == Gender.FEMALE) {
      switch (DiceGenerator.getRandom(19)) {
        default:
        case 0: sb.append("Ba"); break;
        case 1: sb.append("Lu"); break;
        case 2: sb.append("Ro"); break;
        case 3: sb.append("Go"); break;
        case 4: sb.append("Bu"); break;
        case 5: sb.append("Ush"); break;
        case 6: sb.append("Mo"); break;
        case 7: sb.append("Mu"); break;
        case 8: sb.append("Ug"); break;
        case 9: sb.append("Ma"); break;
        case 10: sb.append("Ya"); break;
        case 11: sb.append("Shu"); break;
        case 12: sb.append("Ku"); break;
        case 13: sb.append("Ya"); break;
        case 14: sb.append("Sha"); break;
        case 15: sb.append("Du"); break;
        case 16: sb.append("Gu"); break;
        case 17: sb.append("Ta"); break;
        case 18: sb.append("Yo"); break;
        case 19: sb.append("Wu"); break;
      }
      if (DiceGenerator.getRandom(3) == 0) {
        switch (DiceGenerator.getRandom(19)) {
          default:
          case 0: sb.append("la"); break;
          case 1: sb.append("mu"); break;
          case 2: sb.append("go"); break;
          case 3: sb.append("ro"); break;
          case 4: sb.append("ra"); break;
          case 5: sb.append("sh"); break;
          case 6: sb.append("lo"); break;
          case 7: sb.append("gu"); break;
          case 8: sb.append("ro"); break;
          case 9: sb.append("ga"); break;
          case 10: sb.append("ma"); break;
          case 11: sb.append("ruh"); break;
          case 12: sb.append("ru"); break;
          case 13: sb.append("ka"); break;
          case 14: sb.append("ha"); break;
          case 15: sb.append("re"); break;
          case 16: sb.append("rug"); break;
          case 17: sb.append("rog"); break;
          case 18: sb.append("mul"); break;
          case 19: sb.append("gub"); break;
        }
      }
      switch (DiceGenerator.getRandom(19)) {
        default:
        case 0: sb.append("dush"); break;
        case 1: sb.append("bum"); break;
        case 2: sb.append("nar"); break;
        case 3: sb.append("lorz"); break;
        case 4: sb.append("barz"); break;
        case 5: sb.append("guk"); break;
        case 6: sb.append("mol"); break;
        case 7: sb.append("ta"); break;
        case 8: sb.append("toa"); break;
        case 9: sb.append("song"); break;
        case 10: sb.append("gorn"); break;
        case 11: sb.append("zul"); break;
        case 12: sb.append("hag"); break;
        case 13: sb.append("bon"); break;
        case 14: sb.append("rub"); break;
        case 15: sb.append("bog"); break;
        case 16: sb.append("zat"); break;
        case 17: sb.append("mash"); break;
        case 18: sb.append("long"); break;
        case 19: sb.append("mog"); break;
      }
    }
    sb.append(" ");
    switch (DiceGenerator.getRandom(19)) {
      default:
      case 0: sb.append("Turbo"); break;
      case 1: sb.append("Brave"); break;
      case 2: sb.append("Muscle"); break;
      case 3: sb.append("War"); break;
      case 4: sb.append("Bane"); break;
      case 5: sb.append("Blood"); break;
      case 6: sb.append("Neon"); break;
      case 7: sb.append("Red"); break;
      case 8: sb.append("Blue"); break;
      case 9: sb.append("Steel"); break;
      case 10: sb.append("Pulse"); break;
      case 11: sb.append("Radiant"); break;
      case 12: sb.append("Waste"); break;
      case 13: sb.append("Titanium"); break;
      case 14: sb.append("Ash"); break;
      case 15: sb.append("Rogue"); break;
      case 16: sb.append("Golden"); break;
      case 17: sb.append("Sulfur"); break;
      case 18: sb.append("Rare"); break;
      case 19: sb.append("Raw"); break;
    }
    switch (DiceGenerator.getRandom(19)) {
      default:
      case 0: sb.append("laser"); break;
      case 1: sb.append("station"); break;
      case 2: sb.append("destroyer"); break;
      case 3: sb.append("hunter"); break;
      case 4: sb.append("sword"); break;
      case 5: sb.append("lane"); break;
      case 6: sb.append("city"); break;
      case 7: sb.append("moon"); break;
      case 8: sb.append("solaris"); break;
      case 9: sb.append("phasor"); break;
      case 10: sb.append("rifle"); break;
      case 11: sb.append("ripper"); break;
      case 12: sb.append("land"); break;
      case 13: sb.append("armor"); break;
      case 14: sb.append("planet"); break;
      case 15: sb.append("hammer"); break;
      case 16: sb.append("gauntlet"); break;
      case 17: sb.append("fighter"); break;
      case 18: sb.append("metal"); break;
      case 19: sb.append("beard"); break;
    }
    return sb.toString();
  }

  /**
   * Generate human leader name
   * @param gender Leader gender
   * @return Human leader name
   */
  private static String generateHumanName(final Gender gender) {
    StringBuilder sb = new StringBuilder();
    if (gender == Gender.MALE) {
      switch (DiceGenerator.getRandom(26)) {
        default:
        case 0: sb.append("Albert"); break;
        case 1: sb.append("Bob"); break;
        case 2: sb.append("Calvin"); break;
        case 3: sb.append("Dylan"); break;
        case 4: sb.append("William"); break;
        case 5: sb.append("Jack"); break;
        case 6: sb.append("Lee"); break;
        case 7: sb.append("James"); break;
        case 8: sb.append("John"); break;
        case 9: sb.append("George"); break;
        case 10: sb.append("Billy"); break;
        case 11: sb.append("Joe"); break;
        case 12: sb.append("Rodney"); break;
        case 13: sb.append("Chuck"); break;
        case 14: sb.append("Aaron"); break;
        case 15: sb.append("Donald"); break;
        case 16: sb.append("Barry"); break;
        case 17: sb.append("Saul"); break;
        case 18: sb.append("Seamus"); break;
        case 19: sb.append("Walter"); break;
        case 20: sb.append("Kevin"); break;
        case 21: sb.append("Steve"); break;
        case 22: sb.append("Eric"); break;
        case 23: sb.append("Karl"); break;
        case 24: sb.append("Malcom"); break;
        case 25: sb.append("Alan"); break;
        case 26: sb.append("Thomas"); break;
      }
    }
    if (gender == Gender.FEMALE) {
      switch (DiceGenerator.getRandom(22)) {
        default:
        case 0: sb.append("Samatha"); break;
        case 1: sb.append("Kendra"); break;
        case 2: sb.append("Elizabeth"); break;
        case 3: sb.append("Helena"); break;
        case 4: sb.append("Kara"); break;
        case 5: sb.append("Sharon"); break;
        case 6: sb.append("Diana"); break;
        case 7: sb.append("Erin"); break;
        case 8: sb.append("Cally"); break;
        case 9: sb.append("Linda"); break;
        case 10: sb.append("Marie"); break;
        case 11: sb.append("Joana"); break;
        case 12: sb.append("Lisa"); break;
        case 13: sb.append("Anna"); break;
        case 14: sb.append("Elsa"); break;
        case 15: sb.append("Laura"); break;
        case 16: sb.append("Nicki"); break;
        case 17: sb.append("Grace"); break;
        case 18: sb.append("Kaylee"); break;
        case 19: sb.append("Gina"); break;
        case 20: sb.append("Melinda"); break;
        case 21: sb.append("Kimberly"); break;
        case 22: sb.append("Tia"); break;
      }
    }
    if (DiceGenerator.getRandom(3) == 0) {
      sb.append(" ");
      switch (DiceGenerator.getRandom(17)) {
        default:
        case 0: sb.append("A."); break;
        case 1: sb.append("B."); break;
        case 2: sb.append("C."); break;
        case 3: sb.append("D."); break;
        case 4: sb.append("W."); break;
        case 5: sb.append("J."); break;
        case 6: sb.append("L."); break;
        case 7: sb.append("J."); break;
        case 8: sb.append("G."); break;
        case 9: sb.append("R."); break;
        case 10: sb.append("S."); break;
        case 11: sb.append("K."); break;
        case 12: sb.append("E."); break;
        case 13: sb.append("K."); break;
        case 14: sb.append("M."); break;
        case 15: sb.append("H."); break;
        case 16: sb.append("N."); break;
        case 17: sb.append("T."); break;
      }
    }
    sb.append(" ");
    //Surname
    switch (DiceGenerator.getRandom(43)) {
      default:
      case 0: sb.append("Adama"); break;
      case 1: sb.append("Nagala"); break;
      case 2: sb.append("Fisk"); break;
      case 3: sb.append("Spencer"); break;
      case 4: sb.append("Shaw"); break;
      case 5: sb.append("Valerii"); break;
      case 6: sb.append("Thrace"); break;
      case 7: sb.append("Corman"); break;
      case 8: sb.append("Cain"); break;
      case 9: sb.append("Riker"); break;
      case 10: sb.append("Kirk"); break;
      case 11: sb.append("McCoy"); break;
      case 12: sb.append("Hawkins"); break;
      case 13: sb.append("Jameson"); break;
      case 14: sb.append("Torres"); break;
      case 15: sb.append("Armstrong"); break;
      case 16: sb.append("O'Neil"); break;
      case 17: sb.append("Rush"); break;
      case 18: sb.append("Young"); break;
      case 19: sb.append("Hunt"); break;
      case 20: sb.append("Harper"); break;
      case 21: sb.append("Hammond"); break;
      case 22: sb.append("Carter"); break;
      case 23: sb.append("Jackson"); break;
      case 24: sb.append("Sheppard"); break;
      case 25: sb.append("McKay"); break;
      case 26: sb.append("Weir"); break;
      case 27: sb.append("Crichton"); break;
      case 28: sb.append("Reynolds"); break;
      case 29: sb.append("Serra"); break;
      case 30: sb.append("Cobb"); break;
      case 31: sb.append("Tam"); break;
      case 32: sb.append("Frye"); break;
      case 33: sb.append("Zelnick"); break;
      case 34: sb.append("Isamu"); break;
      case 35: sb.append("Robinson"); break;
      case 36: sb.append("Mercer"); break;
      case 37: sb.append("Taylor"); break;
      case 38: sb.append("Bridger"); break;
      case 39: sb.append("Ford"); break;
      case 40: sb.append("Brody"); break;
      case 41: sb.append("Kovacs"); break;
      case 42: sb.append("Kawahara"); break;
      case 43: sb.append("Hideki"); break;
    }
    return sb.toString();
  }

  /**
   * Generate Leader name.
   * @param race SpaceRace for which name will generated
   * @param gender Leader gender
   * @return Leader name.
   */
  public static String generateName(final SpaceRace race, final Gender gender) {
    if (race == SpaceRace.HUMAN) {
      return generateHumanName(gender);
    }
    if (race == SpaceRace.SPORKS) {
      return generateSporkName(gender);
    }
    if (race == SpaceRace.TEUTHIDAES) {
      return generateTeuthidaeName(gender);
    }
    if (race == SpaceRace.CHIRALOIDS) {
      return generateChiraloidName(gender);
    }
    return "Noname";
  }
}