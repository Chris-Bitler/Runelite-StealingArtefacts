package io.cbitler.stealingartefacts;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("stealingartefacts")
public interface StealingArtefactsConfig extends Config {
    String GROUP_NAME = "StealingArtefacts";
    String CURRENT_STATE_KEY = "currentState";

    String HIGHLIGHT_PATROLS = "highlightPatrols";

    String SHOW_TO_NEXT_LEVEL = "showToNextLevel";

    @ConfigItem(
            keyName = CURRENT_STATE_KEY,
            name = "",
            description ="",
            hidden = true
    )
    default int currentHouse() {
        return -1;
    }

    @ConfigItem(
            keyName = HIGHLIGHT_PATROLS,
            name = "Highlight Patrols",
            description = "Whether or not to highlight patrols"
    )
    default boolean highlightPatrols() { return true; }

    @ConfigItem(
            keyName = SHOW_TO_NEXT_LEVEL,
            name = "Show artefacts to next level",
            description = "Whether or not to show artefacts to next level"
    )
    default boolean showToNextLevel() { return true; }}
