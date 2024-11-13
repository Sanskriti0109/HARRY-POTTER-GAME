# Harry Potter World

---

## Background
This is a **Harry Potter-themed RPG** game built using **Java** and **object-oriented principles**. This terminal-based game showcases **design patterns**, **scalability**, and **extensibility** through 46 well-organized classes. It highlights teamwork and code efficiency, allowing for an immersive RPG experience.

**Project Developer:** Sanskriti Saxena  

---

## Game Experience 
![Legends](https://github.com/user-attachments/assets/6c6b3f9a-5458-4195-b359-1ff6909e3cde)

## Game Workflow

1. The game starts with a sound effect and prompts players to start or quit.
2. If players choose to play, the game welcomes them and provides instructions.
3. Players select heroes for their team.
4. The game map is displayed, and players can use **w/a/s/d/q/i/o/p/u/f/c/t/b/v/m** to control their heroes.
5. Players can buy/sell items in the nexus (market) cells.
6. Heroes encounter different cell types, each impacting their stats.
7. When the hero team confronts monsters, a multi-round fight ensues.
8. Defeated heroes respawn in their original nexus.
9. The game ends if an opponent reaches the other's nexus or all heroes are dead.
10. Every 8 rounds, three new monsters spawn in the monster nexus.

---

## Class Structure (Suggested Reading Order)

1. **GameEntrance.java** - Main entry point for the game.
2. **MultiThreadsStarter.java** - Initiates all threads.
3. **NotificationCenter.java** - Central message storage for in-game notifications.
4. **Colors.java** - Defines color schemes for terminal outputs.
5. **Trade.java** - Interface for tradeable items.
6. **Props.java** - Base class for all props in the game.
7. **CauseDamage.java** - Interface for damage-causing items.
8. **Weapon.java** - Represents a weapon, which inflicts damage and can be traded.
9. **Armor.java** - Manages armor properties, inheriting from `Props`.
10. **Potion.java** - Represents potions as a type of prop.
11. **Spell.java** - Represents spells that cause damage.
12. **FireSpell.java** - A specific type of spell with fire effects.
13. **IceSpell.java** - A specific type of spell with ice effects.
14. **LightningSpell.java** - A specific type of spell with lightning effects.
15. **Role.java** - Base class for roles in the game (heroes and monsters).
16. **Fight.java** - Interface for classes with combat abilities.
17. **Monster.java** - Manages monster properties and extends `Role`.
18. **Dragon.java** - Represents a dragon monster.
19. **Exoskeleton.java** - Represents an exoskeleton monster.
20. **Spirit.java** - Represents a spirit monster.
21. **MonsterList.java** - Stores all the monsters in the game.
22. **Hero.java** - Base class for heroes, extending `Role`.
23. **Paladin.java** - Represents a hero of type Paladin.
24. **Sorcerer.java** - Represents a hero of type Sorcerer.
25. **Warrior.java** - Represents a hero of type Warrior.
26. **HeroList.java** - Stores all heroes in the game.
27. **HeroTeam.java** - Manages team operations for heroes.
28. **LevelUpBehavior.java** - Strategy pattern for hero level-up behavior.
29. **PaladinLevelUp.java** - Level-up strategy for Paladins.
30. **SorcererLevelUp.java** - Level-up strategy for Sorcerers.
31. **WarriorLevelUp.java** - Level-up strategy for Warriors.
32. **Map.java** - Represents the game map.
33. **Cell.java** - Represents a cell on the map.
34. **BushCell.java** - Represents a bush cell, with specific effects.
35. **CaveCell.java** - Represents a cave cell, with specific effects.
36. **InaccessibleCell.java** - Represents an inaccessible cell on the map.
37. **NexusCell.java** - Base class for nexus cells.
38. **HeroNexusCell.java** - Nexus cell specific to heroes.
39. **MonsterNexusCell.java** - Nexus cell specific to monsters.
40. **PlainCell.java** - Represents a plain cell.
41. **KoulouCell.java** - Represents a koulou cell.
42. **Market.java** - Stores the items available in the market.
43. **Game.java** - Base class for all game types.
44. **RPGGame.java** - Base class for RPG-style games.
45. **LegendsGame.java** - Main game logic for Legends of Valor, utilizing threads.
46. **Sound.java** - Manages sound and music playback in the game.

---

## Compilation and Execution

### Windows Terminal Instructions

1. Place all 46 classes into a single folder.
2. Run the codes.
