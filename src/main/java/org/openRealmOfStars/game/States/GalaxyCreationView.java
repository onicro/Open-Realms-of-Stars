package org.openRealmOfStars.game.States;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;

import org.openRealmOfStars.audio.soundeffect.SoundPlayer;
import org.openRealmOfStars.game.GameCommands;
import org.openRealmOfStars.gui.buttons.SpaceButton;
import org.openRealmOfStars.gui.buttons.SpaceCombo;
import org.openRealmOfStars.gui.infopanel.InfoPanel;
import org.openRealmOfStars.gui.labels.SpaceLabel;
import org.openRealmOfStars.gui.panels.BigImagePanel;
import org.openRealmOfStars.gui.panels.BlackPanel;
import org.openRealmOfStars.gui.panels.InvisiblePanel;
import org.openRealmOfStars.starMap.Coordinate;
import org.openRealmOfStars.starMap.GalaxyConfig;
import org.openRealmOfStars.starMap.planet.Planet;
import org.openRealmOfStars.starMap.planet.PlanetTypes;
import org.openRealmOfStars.utilities.DiceGenerator;

/**
 *
 * Open Realm of Stars game project
 * Copyright (C) 2016,2018  Tuomo Untinen
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
 * Galaxy creation view for Open Realm of Stars
 *
 */
public class GalaxyCreationView extends BlackPanel {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * ComboBox on galaxy size
   */
  private SpaceCombo<String> comboGalaxySize;

  /**
   * ComboBox on number of player
   */
  private SpaceCombo<String> comboPlayers;

  /**
   * ComboBox on player start positions
   */
  private SpaceCombo<String> comboPlayerPos;

  /**
   * ComboBox on sun density
   */
  private SpaceCombo<String> comboSunDensity;

  /**
   * ComboBox on planetary event
   */
  private SpaceCombo<String> comboPlanetaryEvent;

  /**
   * ComboBox on scoring victory
   */
  private SpaceCombo<String> comboScoringVictory;

  /**
   * ComboBox on scoring culture
   */
  private SpaceCombo<String> comboScoringCulture;

  /**
   * ComboBox on scoring domination
   */
  private SpaceCombo<String> comboScoringDomination;

  /**
   * ComboBox for rogue planet
   */
  private SpaceCombo<String> comboRoguePlanets;

  /**
   * ComboBox for space pirates
   */
  private SpaceCombo<String> comboSpacePirates;

  /**
   * Galaxy config
   */
  private GalaxyConfig config;

  /**
   * Constructor for Galaxy Creation View
   * @param config Galaxy Configuration
   * @param listener ActionListener
   */
  public GalaxyCreationView(final GalaxyConfig config,
      final ActionListener listener) {
    if (config == null) {
      this.config = new GalaxyConfig();
    } else {
      this.config = config;
    }
    Planet planet = new Planet(new Coordinate(1, 1), "Galaxy Creation Planet",
        1, false);
    if (DiceGenerator.getRandom(100) < 10) {
      planet.setPlanetType(PlanetTypes.getRandomPlanetType(true));
      planet.setGasGiant(true);
    } else {
      planet.setPlanetType(PlanetTypes.getRandomPlanetType(false));
    }
    // Background image
    BigImagePanel imgBase = new BigImagePanel(planet, true, "Galaxy Creation");
    imgBase.setLayout(new BorderLayout());
    this.setLayout(new BorderLayout());

    InvisiblePanel invisible = new InvisiblePanel(imgBase);
    invisible.setLayout(new BoxLayout(invisible, BoxLayout.Y_AXIS));
    invisible.add(Box.createRigidArea(new Dimension(500, 250)));

    InvisiblePanel xinvis = new InvisiblePanel(invisible);
    xinvis.setLayout(new BoxLayout(xinvis, BoxLayout.X_AXIS));
    xinvis.add(Box.createRigidArea(new Dimension(200, 5)));
    InfoPanel info = new InfoPanel();
    info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));
    info.setTitle("Galaxy Creation");
    SpaceLabel label = new SpaceLabel("Galaxy size:");
    label.setAlignmentX(CENTER_ALIGNMENT);
    info.add(label);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    String[] galaxySizes = new String[6];
    galaxySizes[0] = "Tiny 50x50";
    galaxySizes[1] = "Small 75x75";
    galaxySizes[2] = "Medium 128x128";
    galaxySizes[3] = "Large 160x160";
    galaxySizes[4] = "Very large 200x200";
    galaxySizes[5] = "Huge 256x256";
    comboGalaxySize = new SpaceCombo<>(galaxySizes);
    comboGalaxySize.setSelectedIndex(this.config.getGalaxySizeIndex());
    comboGalaxySize.setActionCommand(GameCommands.COMMAND_GALAXY_SETUP);
    comboGalaxySize.addActionListener(listener);
    info.add(comboGalaxySize);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    label = new SpaceLabel("Sun density:");
    label.setAlignmentX(CENTER_ALIGNMENT);
    info.add(label);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    String[] sunDensity = new String[4];
    sunDensity[0] = "Sparse";
    sunDensity[1] = "Medium";
    sunDensity[2] = "Dense";
    sunDensity[3] = "Overlap";
    comboSunDensity = new SpaceCombo<>(sunDensity);
    comboSunDensity.setSelectedIndex(this.config.getSunDensityIndex());
    comboSunDensity.setActionCommand(GameCommands.COMMAND_GALAXY_SETUP);
    comboSunDensity.addActionListener(listener);
    info.add(comboSunDensity);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    label = new SpaceLabel("Planetary events:");
    label.setAlignmentX(CENTER_ALIGNMENT);
    info.add(label);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    String[] events = new String[5];
    events[0] = "No events (0%)";
    events[1] = "Very rare (5%)";
    events[2] = "Rare (10%)";
    events[3] = "Common (20%)";
    events[4] = "Very common (40%)";
    comboPlanetaryEvent = new SpaceCombo<>(events);
    switch (this.config.getChanceForPlanetaryEvent()) {
      case 0: comboPlanetaryEvent.setSelectedIndex(0); break;
      case 5: comboPlanetaryEvent.setSelectedIndex(1); break;
      case 10: comboPlanetaryEvent.setSelectedIndex(2); break;
      case 20: comboPlanetaryEvent.setSelectedIndex(3); break;
      case 40: comboPlanetaryEvent.setSelectedIndex(4); break;
      default: comboPlanetaryEvent.setSelectedIndex(2); break;
    }
    comboPlanetaryEvent.setActionCommand(GameCommands.COMMAND_GALAXY_SETUP);
    comboPlanetaryEvent.addActionListener(listener);
    info.add(comboPlanetaryEvent);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    label = new SpaceLabel("Rogue planets:");
    label.setAlignmentX(CENTER_ALIGNMENT);
    info.add(label);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    String[] roguePlanets = new String[5];
    roguePlanets[0] = "None";
    roguePlanets[1] = "Very few";
    roguePlanets[2] = "Few(Default)";
    roguePlanets[3] = "Some";
    roguePlanets[4] = "Many";
    comboRoguePlanets = new SpaceCombo<>(roguePlanets);
    switch (this.config.getNumberOfRoguePlanets()) {
      case GalaxyConfig.ROGUE_PLANETS_NONE:
        comboRoguePlanets.setSelectedIndex(0); break;
      case GalaxyConfig.ROGUE_PLANETS_VERY_FEW:
        comboRoguePlanets.setSelectedIndex(1); break;
      case GalaxyConfig.ROGUE_PLANETS_FEW:
        comboRoguePlanets.setSelectedIndex(2); break;
      case GalaxyConfig.ROGUE_PLANETS_SOME:
        comboRoguePlanets.setSelectedIndex(3); break;
      case GalaxyConfig.ROGUE_PLANETS_MANY:
        comboRoguePlanets.setSelectedIndex(4); break;
      default: comboRoguePlanets.setSelectedIndex(2); break;
    }
    comboRoguePlanets.setActionCommand(GameCommands.COMMAND_GALAXY_SETUP);
    comboRoguePlanets.addActionListener(listener);
    comboRoguePlanets.setToolTipText("Rogue planets are rare planet are outside"
        + " of solar systems.");
    info.add(comboRoguePlanets);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    xinvis.add(info);

    label = new SpaceLabel("Space pirates:");
    label.setAlignmentX(CENTER_ALIGNMENT);
    info.add(label);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    String[] spacePirates = new String[7];
    spacePirates[0] = "Disabled pirates and monsters";
    spacePirates[1] = "Very rare 10%";
    spacePirates[2] = "Rare 20%";
    spacePirates[3] = "Few 40%";
    spacePirates[4] = "Common 60%";
    spacePirates[5] = "Very common 80%";
    spacePirates[6] = "All over 100%";
    comboSpacePirates = new SpaceCombo<>(spacePirates);
    comboSpacePirates.setSelectedIndex(this.config.getSpacePiratesLevel());
    comboSpacePirates.setActionCommand(GameCommands.COMMAND_GALAXY_SETUP);
    comboSpacePirates.addActionListener(listener);
    comboSpacePirates.setToolTipText("<html>How many percent of deep space"
        + " anchors contain space pirates lair.<br>"
        + "If disable there are no space monster or space pirates in "
        + "space anomalies either.<html>");
    info.add(comboSpacePirates);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    xinvis.add(info);
    xinvis.add(Box.createRigidArea(new Dimension(200, 5)));

    info = new InfoPanel();
    info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));
    info.setTitle("Player Setting");
    label = new SpaceLabel("Number of players:");
    label.setAlignmentX(CENTER_ALIGNMENT);
    info.add(label);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    String[] players = new String[7];
    players[0] = "Two players";
    players[1] = "Three players";
    players[2] = "Four players";
    players[3] = "Five players";
    players[4] = "Six players";
    players[5] = "Seven players";
    players[6] = "Eight players";
    comboPlayers = new SpaceCombo<>(players);
    comboPlayers.setSelectedIndex(this.config.getMaxPlayers() - 2);
    comboPlayers.setActionCommand(GameCommands.COMMAND_GALAXY_SETUP);
    comboPlayers.addActionListener(listener);
    info.add(comboPlayers);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    label = new SpaceLabel("Starting position:");
    label.setAlignmentX(CENTER_ALIGNMENT);
    info.add(label);
    info.add(Box.createRigidArea(new Dimension(5, 8)));
    String[] startPos = new String[2];
    startPos[0] = "Border";
    startPos[1] = "Random";
    comboPlayerPos = new SpaceCombo<>(startPos);
    comboPlayerPos.setSelectedIndex(this.config.getStartingPosition());
    comboPlayerPos.setActionCommand(GameCommands.COMMAND_GALAXY_SETUP);
    comboPlayerPos.addActionListener(listener);
    info.add(comboPlayerPos);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    label = new SpaceLabel("Victory by score:");
    label.setAlignmentX(CENTER_ALIGNMENT);
    info.add(label);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    String[] scoringVictory = new String[6];
    scoringVictory [0] = "Very short (200 turns)";
    scoringVictory [1] = "Short (300 turns)";
    scoringVictory [2] = "Medium (400 turns)";
    scoringVictory [3] = "Long (600 turns)";
    scoringVictory [4] = "Very long (800 turns)";
    scoringVictory [5] = "Massive (1000 turns)";
    comboScoringVictory = new SpaceCombo<>(scoringVictory);
    comboScoringVictory.setToolTipText("How many turns game is played before"
        + " winner is decided by game score");
    switch (this.config.getScoringVictoryTurns()) {
      case 200: comboScoringVictory.setSelectedIndex(0); break;
      case 300: comboScoringVictory.setSelectedIndex(1); break;
      case 400: comboScoringVictory.setSelectedIndex(2); break;
      case 600: comboScoringVictory.setSelectedIndex(3); break;
      case 800: comboScoringVictory.setSelectedIndex(4); break;
      case 1000: comboScoringVictory.setSelectedIndex(5); break;
      default: comboScoringVictory.setSelectedIndex(2); break;
    }
    comboScoringVictory.setActionCommand(GameCommands.COMMAND_GALAXY_SETUP);
    comboScoringVictory.addActionListener(listener);
    info.add(comboScoringVictory);
    info.add(Box.createRigidArea(new Dimension(5, 5)));

    label = new SpaceLabel("Victory by culture:");
    label.setAlignmentX(CENTER_ALIGNMENT);
    info.add(label);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    String[] scoringCulture = new String[5];
    scoringCulture [0] = "Disable cultural victory";
    scoringCulture [1] = "Faster (75% regular limit)";
    scoringCulture [2] = "Normal (100% regular limit)";
    scoringCulture [3] = "Slower (150% regular limit)";
    scoringCulture [4] = "Very slow (200% regular limit)";
    comboScoringCulture = new SpaceCombo<>(scoringCulture);
    comboScoringCulture.setToolTipText("How much culture must gain before"
        + " winning by cultural domination.");
    switch (this.config.getScoreLimitCulture()) {
      case -1: comboScoringCulture.setSelectedIndex(0); break;
      case 0: comboScoringCulture.setSelectedIndex(1); break;
      case 1: comboScoringCulture.setSelectedIndex(2); break;
      case 2: comboScoringCulture.setSelectedIndex(3); break;
      case 3: comboScoringCulture.setSelectedIndex(4); break;
      default: comboScoringCulture.setSelectedIndex(2); break;
    }
    comboScoringCulture.setActionCommand(GameCommands.COMMAND_GALAXY_SETUP);
    comboScoringCulture.addActionListener(listener);
    info.add(comboScoringCulture);
    info.add(Box.createRigidArea(new Dimension(5, 5)));

    label = new SpaceLabel("Victory by domination:");
    label.setAlignmentX(CENTER_ALIGNMENT);
    info.add(label);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    String[] scoringDomination = new String[2];
    scoringDomination[0] = "Disabled";
    scoringDomination[1] = "Enabled";
    comboScoringDomination = new SpaceCombo<>(scoringDomination);
    comboScoringDomination.setToolTipText("<html>Domination victory when all "
        + "home planets are controlled by one realm or alliance.<br> This is "
        + "enabled only if 4 or more realms in play.</html>");
    comboScoringDomination.setActionCommand(GameCommands.COMMAND_GALAXY_SETUP);
    comboScoringDomination.addActionListener(listener);
    info.add(comboScoringDomination);
    info.add(Box.createRigidArea(new Dimension(5, 5)));
    switch (this.config.getScoreLimitConquer()) {
      case 0: comboScoringDomination.setSelectedIndex(0); break;
      case 1: comboScoringDomination.setSelectedIndex(1); break;
      default: comboScoringDomination.setSelectedIndex(1); break;
    }
    xinvis.add(info);
    xinvis.add(Box.createRigidArea(new Dimension(200, 5)));
    invisible.add(xinvis);
    invisible.add(Box.createRigidArea(new Dimension(200, 300)));

    imgBase.add(invisible, BorderLayout.CENTER);

    invisible = new InvisiblePanel(imgBase);
    invisible.setLayout(new BorderLayout());
    SpaceButton btn = new SpaceButton("Cancel", GameCommands.COMMAND_CANCEL);
    btn.addActionListener(listener);
    btn.setAlignmentX(Component.CENTER_ALIGNMENT);
    invisible.add(btn, BorderLayout.WEST);
    btn = new SpaceButton("Next", GameCommands.COMMAND_NEXT);
    btn.addActionListener(listener);
    btn.setAlignmentX(Component.CENTER_ALIGNMENT);
    invisible.add(btn, BorderLayout.EAST);
    imgBase.add(invisible, BorderLayout.SOUTH);
    this.add(imgBase, BorderLayout.CENTER);
  }

  /**
   * Galaxy size configuration for very small galaxy
   */
  private static final int GALAXY_SIZE_VERY_SMALL = 50;

  /**
   * Galaxy size configuration for small galaxy
   */
  private static final int GALAXY_SIZE_SMALL = 75;
  /**
   * Galaxy size configuration for medium galaxy
   */
  private static final int GALAXY_SIZE_MEDIUM = 128;
  /**
   * Galaxy size configuration for large galaxy
   */
  private static final int GALAXY_SIZE_LARGE = 160;
  /**
   * Galaxy size configuration for very large galaxy
   */
  private static final int GALAXY_SIZE_VERY_LARGE = 200;
  /**
   * Galaxy size configuration for huge galaxy
   */
  private static final int GALAXY_SIZE_HUGE = 256;
  /**
   * Handle actions for Galaxy Creation view
   * @param arg0 The event to handle
   */
  public void handleActions(final ActionEvent arg0) {
    if (arg0.getActionCommand().equals(GameCommands.COMMAND_GALAXY_SETUP)) {
      SoundPlayer.playMenuSound();
      config.setMaxPlayers(comboPlayers.getSelectedIndex() + 2);
      config.setStartingPosition(comboPlayerPos.getSelectedIndex());
      switch (comboGalaxySize.getSelectedIndex()) {
      case 0: {
        // Very small
        config.setSize(GALAXY_SIZE_VERY_SMALL,
            comboGalaxySize.getSelectedIndex());
        break;
      }
      case 1: {
        // Small
        config.setSize(GALAXY_SIZE_SMALL, comboGalaxySize.getSelectedIndex());
        break;
      }
      case 2: {
        // Medium
        config.setSize(GALAXY_SIZE_MEDIUM, comboGalaxySize.getSelectedIndex());
        break;
      }
      case 3: {
        // Large
        config.setSize(GALAXY_SIZE_LARGE, comboGalaxySize.getSelectedIndex());
        break;
      }
      case 4: {
        // Very Large
        config.setSize(GALAXY_SIZE_VERY_LARGE,
            comboGalaxySize.getSelectedIndex());
        break;
      }
      case 5: {
        // Huge
        config.setSize(GALAXY_SIZE_HUGE, comboGalaxySize.getSelectedIndex());
        break;
      }
      default: {
        // SMALL
        config.setSize(GALAXY_SIZE_SMALL, comboGalaxySize.getSelectedIndex());
        break;
      }
      }
      switch (comboSunDensity.getSelectedIndex()) {
      case 0: {
        // SPARSE
        config.setSolarSystemDistance(12, comboSunDensity.getSelectedIndex());
        break;
      }
      case 1: {
        // Medium
        config.setSolarSystemDistance(10, comboSunDensity.getSelectedIndex());
        break;
      }
      case 2: {
        // Dense
        config.setSolarSystemDistance(7, comboSunDensity.getSelectedIndex());
        break;
      }
      case 3: {
        // Overlap
        config.setSolarSystemDistance(6, comboSunDensity.getSelectedIndex());
        break;
      }
      default: {
        // SPARSE
        config.setSolarSystemDistance(10, comboSunDensity.getSelectedIndex());
        break;
      }
      }
      switch (comboPlanetaryEvent.getSelectedIndex()) {
      case 0: {
        // None
        config.setChanceForPlanetaryEvent(0);
        break;
      }
      case 1: {
        // Very rare
        config.setChanceForPlanetaryEvent(5);
        break;
      }
      case 2: {
        // Rare
        config.setChanceForPlanetaryEvent(10);
        break;
      }
      case 3: {
        // Common
        config.setChanceForPlanetaryEvent(20);
        break;
      }
      case 4: {
        // Very Common
        config.setChanceForPlanetaryEvent(40);
        break;
      }
      default: {
        // Default
        config.setChanceForPlanetaryEvent(0);
        break;
      }
      }
      switch (comboRoguePlanets.getSelectedIndex()) {
      case 0: {
        // None
        config.setNumberOfRoguePlanets(GalaxyConfig.ROGUE_PLANETS_NONE);
        break;
      }
      case 1: {
        // Very few
        config.setNumberOfRoguePlanets(GalaxyConfig.ROGUE_PLANETS_VERY_FEW);
        break;
      }
      case 2: {
        // Few
        config.setNumberOfRoguePlanets(GalaxyConfig.ROGUE_PLANETS_FEW);
        break;
      }
      case 3: {
        // Some
        config.setNumberOfRoguePlanets(GalaxyConfig.ROGUE_PLANETS_SOME);
        break;
      }
      case 4: {
        // MANY
        config.setNumberOfRoguePlanets(GalaxyConfig.ROGUE_PLANETS_MANY);
        break;
      }
      default: {
        // Default
        config.setNumberOfRoguePlanets(GalaxyConfig.ROGUE_PLANETS_FEW);
        break;
      }
      }
      config.setSpacePiratesLevel(comboSpacePirates.getSelectedIndex());
      switch (comboScoringVictory.getSelectedIndex()) {
      case 0: {
        // 200 turns
        config.setScoringVictoryTurns(200);
        break;
      }
      case 1: {
        // 300 turns
        config.setScoringVictoryTurns(300);
        break;
      }
      case 2: {
        // 400 turns
        config.setScoringVictoryTurns(400);
        break;
      }
      case 3: {
        // 600 turns
        config.setScoringVictoryTurns(600);
        break;
      }
      case 4: {
        // 800 turns
        config.setScoringVictoryTurns(800);
        break;
      }
      case 5: {
        // 1000 turns
        config.setScoringVictoryTurns(1000);
        break;
      }
      default: {
        // Default
        config.setChanceForPlanetaryEvent(400);
        break;
      }
      }
      switch (comboScoringCulture.getSelectedIndex()) {
        case 0: {
          // Disabled
          config.setScoreLimitCulture(-1);
          break;
        }
        case 1: {
          // 75%
          config.setScoreLimitCulture(0);
          break;
        }
        case 2: {
          // 100%
          config.setScoreLimitCulture(1);
          break;
        }
        case 3: {
          // 150%
          config.setScoreLimitCulture(2);
          break;
        }
        case 4: {
          // 200%
          config.setScoreLimitCulture(3);
          break;
        }
        default: {
          // 100%
          config.setScoreLimitCulture(1);
          break;
        }
      }
      switch (comboScoringDomination.getSelectedIndex()) {
        case 0: {
          // Disabled
          config.setScoreLimitConquer(0);
          break;
        }
        case 1: {
          // enabled
          config.setScoreLimitConquer(1);
          break;
        }
        default: {
          // enabled
          config.setScoreLimitCulture(1);
          break;
        }
      }
    }
  }

  /**
   * Get Galaxy configuration
   * @return Galaxy configuration
   */
  public GalaxyConfig getConfig() {
    return config;
  }

}
