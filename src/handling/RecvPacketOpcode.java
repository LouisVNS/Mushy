package handling;

public enum RecvPacketOpcode {

	/*
	 * General Opcodes.
	 * Used for general purposes.
	 */
	LOGIN_REDIRECTOR(0x01),
	CRASH_INFO(0x2E),
	RSA(0x67), // ...
	PONG(0x9A), // 0x2F
	
	/*
	 * Login Opcodes.
	 * Used for login packets.
	 */
	GUEST_LOGIN(0x16),
	SERVERSTATUS_REQUEST(0x9D), // 0x1D
	TOS(0x1D),
	VIEW_SERVERLIST(0x21),
	SERVERLIST_REQUEST(0xA2), // 0x22
	REDISPLAY_SERVERLIST(0x72), // 0x23
	USE_AUTH_SERVER(0xAB), // ...
	CHAR_SELECT_NO_PIC(0xA6), // 0x25
	PLAYER_LOGGEDIN(0x6E), // 0x27
	CHECK_CHAR_NAME(0x74), // 0x28
	DELETE_CHAR(0x80), // 0x2C
	AUTH_REQUEST(0x86), // 0x30
	CHAR_SELECT(0x6C), // 0x31
	VIEW_REGISTER_PIC(0x32),
	CHANGE_PIC_REQUEST(0xAA), // 0x33
	VIEW_SELECT_PIC(0x35),
	CLIENT_START(0x98), // 0x38
	CLIENT_FAILED(0x39),
	PART_TIME_JOB(0x3B),
	CHARACTER_CARD(0x3C),
	ENABLE_LV50_CHAR(0x3D),
	CREATE_LV50_CHAR(0x3E),
	ENABLE_SPECIAL_CREATION(0x3E),
	CLIENT_HELLO(0x67), // 0x3F
	LOGIN_PASSWORD(0x69), // 0x40
	CREATE_SPECIAL_CHAR(0x41),
	CHARLIST_REQUEST(0x6A), // 0x43
	CREATE_CHAR(0x7D), // 0x45
	CREATE_ULTIMATE(0x999),// 0x46
	AUTH_SECOND_PASSWORD(0x6B), // 0x47
	CLIENT_ERROR(0x95), // 0x4A
	/*
	 * Channel Opcodes.
	 * Used for in-handling packets.
	 */
	CHANGE_MAP(0xAF), // 0x51
	CHANGE_CHANNEL(0xB0), // 0x52
	ENTER_CASH_SHOP(0xB4), // 0x54
	ENTER_FARM(0xB7), // 0x57
	ENTER_AZWAN(0x4D),
	ENTER_AZWAN_EVENT(0x4A),
	LEAVE_AZWAN(0x4B),
	ENTER_PVP(0x55),
	ENTER_PVP_PARTY(0x59),
	LEAVE_PVP(0x999),
	MOVE_PLAYER(0xBE), // 0x5E
	CANCEL_CHAIR(0x60),
	USE_CHAIR(0x61),
	CLOSE_RANGE_ATTACK(0xC3), // 0x62
	RANGED_ATTACK(0xC4), // 0x63
	MAGIC_ATTACK(0xC5), // 0x64
	PASSIVE_ENERGY(0x65),
	TAKE_DAMAGE(0xC9), // 0x68
	PVP_ATTACK(0x999), // 0x69
	GENERAL_CHAT(0xCB), // 0x6A
	CLOSE_CHALKBOARD(0x999), // 0x6B
	FACE_EXPRESSION(0xCD), // 0x6C
	FACE_ANDROID(0x6D),
	USE_ITEMEFFECT(0x999), // 0x6E
	WHEEL_OF_FORTUNE(0x999), // 0x6F
	USE_TITLE(0x71),
	ANGELIC_CHANGE(0x72),
	CHANGE_CODEX_SET(0x7A),
	CODEX_UNK(0x7B),
	MONSTER_BOOK_DROPS(0x999), // 0x7D
	NPC_TALK(0xDD), // 0x7F
	NPC_TALK_MORE(0xDF), // 0x81
	NPC_SHOP(0x82),
	STORAGE(0x84),
	USE_HIRED_MERCHANT(0x85),
	MERCH_ITEM_STORE(0x999), // 0x86
	PACKAGE_OPERATION(0x7F),
	MECH_CANCEL(0x88),
	OWL(0x8C),
	OWL_WARP(0x8D),
	ITEM_SORT(0xEF), // 0x92
	ITEM_GATHER(0xF0), // 0x93 to 999?
	ITEM_MOVE(0xF1), // 0x94
	MOVE_BAG(0x999), // 0x95
	SWITCH_BAG(0x96),
	USE_ITEM(0xF6), // 0x98 to 999?
	CANCEL_ITEM_EFFECT(0x99),
	USE_SUMMON_BAG(0x9B),
	PET_FOOD(0x9C),
	USE_MOUNT_FOOD(0x999), // 0x9D
	USE_SCRIPTED_NPC_ITEM(0x9E),
	USE_RECIPE(0x9F),
	USE_NEBULITE(0xA0),
	USE_ALIEN_SOCKET(0xA1),
	USE_ALIEN_SOCKET_RESPONSE(0x999), // 0xA2
	USE_NEBULITE_FUSION(0xA3),
	USE_CASH_ITEM(0xA4),
	USE_CATCH_ITEM(0xA6),
	USE_SKILL_BOOK(0xAB),// 0xAB
	USE_EXP_POTION(0xAC),
	TOT_GUIDE(0xB5),
	USE_OWL_MINERVA(0xBD),
	USE_TELE_ROCK(0x999), // 0xBE
	USE_RETURN_SCROLL(0x111), // 0xBF
	USE_UPGRADE_SCROLL(0xC0),
	USE_FLAG_SCROLL(0xC1),
	USE_EQUIP_SCROLL(0xC2),
	USE_POTENTIAL_SCROLL(0x119), // 0x6C
	USE_BONUS_POTENTIAL(0xC8),
	USE_ABYSS_SCROLL(0xC7),
	USE_CARVED_SEAL(0xC9),
	USE_BAG(0xC9),
	USE_CRAFTED_CUBE(0xCA),
	USE_MAGNIFY_GLASS(0xCD),
	DISTRIBUTE_AP(0x12A), // 0xD0
	AUTO_ASSIGN_AP(0x12C), // 0xD1
	HEAL_OVER_TIME(0x12D), // 0xD2
	DISTRIBUTE_SP(0x130), // 0xD5
	SPECIAL_MOVE(0x131), // 0xD6
	CANCEL_BUFF(0x132), // 0xD7
	SKILL_EFFECT(0x133), // 0xD8
	MESO_DROP(0x134), // 0xD9
	GIVE_FAME(0xDA),
	CHAR_INFO_REQUEST(0x137), // 0xDC
	SPAWN_PET(0x999), // 0xDD
	GET_BOOK_INFO(0xDF),
	USE_FAMILIAR(0xE0),
	SPAWN_FAMILIAR(0xE1),
	RENAME_FAMILIAR(0xE2),
	PET_BUFF(0xE3),
	CANCEL_DEBUFF(0xE4),
	CHANGE_MAP_SPECIAL(0x13B), // 0xE5
	USE_INNER_PORTAL(0xE6),
	TROCK_ADD_MAP(0xE7),
	LIE_DETECTOR(0xE8),
	LIE_DETECTOR_SKILL(0xE9),
	LIE_DETECTOR_RESPONSE(0xEA),
	REPORT(0xEC),
	QUEST_ACTION(0x144), // 0xED
	REISSUE_MEDAL(0xEE),
	//    BUFF_RESPONSE(0xEF),
	SKILL_MACRO(0xF5),
	REWARD_ITEM(0xF5),
	ITEM_MAKER(0x999),
	REPAIR_ALL(0xFE),
	REPAIR(0xFF),
	SOLOMON(0xC9),
	GACH_EXP(0xCA),
	FOLLOW_REQUEST(0xFD),
	PQ_REWARD(0xFE),
	FOLLOW_REPLY(0x101),
	AUTO_FOLLOW_REPLY(0x999),
	USE_TREASURE_CHEST(0x999),
	PROFESSION_INFO(0x102),
	USE_POT(0x999),
	CLEAR_POT(0xD7),
	FEED_POT(0xD8),
	CURE_POT(0xD9),
	REWARD_POT(0xDA),
	AZWAN_REVIVE(0x999), // 0xDB
	ZERO_TAG(0x123),
	USE_COSMETIC(0x124),
	INNER_CIRCULATOR(0x121),
	PVP_RESPAWN(0xCF),
	GAIN_FORCE(0xE0),
	ADMIN_CHAT(0x126),
	PARTYCHAT(0x127),
	COMMAND(0x129),
	SPOUSE_CHAT(0x12A),
	MESSENGER(0x12B),
	PLAYER_INTERACTION(0x12C),
	PARTY_OPERATION(0x12D),
	DENY_PARTY_REQUEST(0x12E),
	ALLOW_PARTY_INVITE(0x12F),
	EXPEDITION_OPERATION(0x130),
	EXPEDITION_LISTING(0x131),
	GUILD_OPERATION(0x132),
	DENY_GUILD_REQUEST(0x133),
	ADMIN_COMMAND(0x999), // 0x134
	ADMIN_LOG(0x135),
	BUDDYLIST_MODIFY(0x137),
	NOTE_ACTION(0x999),
	USE_DOOR(0x13A),
	USE_MECH_DOOR(0x13B),
	CHANGE_KEYMAP(0x19E), // 0x13D
	RPS_GAME(0x135),
	RING_ACTION(0x136),
	WEDDING_ACTION(0x137),
	ALLIANCE_OPERATION(0x13B),
	DENY_ALLIANCE_REQUEST(0x13C),
	BBS_OPERATION(0x150),
	SOLOMON_EXP(0x151),
	NEW_YEAR_CARD(0x11E),
	XMAS_SURPRISE(0x111),
	TWIN_DRAGON_EGG(0x112),
	ARAN_COMBO(0x15D),
	TRANSFORM_PLAYER(0x999),
	CYGNUS_SUMMON(0x999),
	CRAFT_DONE(0x162),
	CRAFT_EFFECT(0x163),
	CRAFT_MAKE(0x164),
	CHANGE_ROOM_CHANNEL(0x169),
	EVENT_CARD(0x15E),
	CHOOSE_SKILL(0x16B),
	SKILL_SWIPE(0x16C),
	VIEW_SKILLS(0x16D),
	CANCEL_OUT_SWIPE(0x16F),
	YOUR_INFORMATION(0x16E),
	FIND_FRIEND(0x16F),//164
	PINKBEAN_CHOCO_OPEN(0x170),
	PINKBEAN_CHOCO_SUMMON(0x171),
	BUY_SILENT_CRUSADE(0x127),
	BUDDY_ADD(0x1A2),
	MOVE_PET(0x1B8),
	PET_CHAT(0x1B9),
	PET_COMMAND(0x1BA),
	PET_LOOT(0x1BB),
	PET_AUTO_POT(0x1BC),
	PET_IGNORE(0x1BD),
	MOVE_HAKU(0x1C1),
	CHANGE_HAKU(0x1C2),
	//HAKU_1D8(0x1D8),
	//HAKU_1D9(0x1D9),
	MOVE_SUMMON(0x1C8),
	SUMMON_ATTACK(0x1C9),
	DAMAGE_SUMMON(0x1CA),
	SUB_SUMMON(0x1CB),
	REMOVE_SUMMON(0x1CC),
	PVP_SUMMON(0x1CE),
	MOVE_DRAGON(0x1D0),
	USE_ITEM_QUEST(0x1D2),
	MOVE_ANDROID(0x1D4),
	UPDATE_QUEST(0x1D5),
	QUEST_ITEM(0x1D6),
	MOVE_FAMILIAR(0x1DC),
	TOUCH_FAMILIAR(0x1DD),
	ATTACK_FAMILIAR(0x1DE),
	REVEAL_FAMILIAR(0x1DF),
	QUICK_SLOT(0x1D7),
	PAM_SONG(0x1D8),
	MOVE_LIFE(0x331), // 0x208
	AUTO_AGGRO(0x1EE),
	FRIENDLY_DAMAGE(0x999),
	MONSTER_BOMB(0x1F0),
	HYPNOTIZE_DMG(0x1F1),
	MOB_BOMB(0x1F5),
	MOB_NODE(0x1F6),
	DISPLAY_NODE(0x1F7),
	MONSTER_CARNIVAL(0x1F8),
	NPC_ACTION(0x34B), // 0x222
	ITEM_PICKUP(0x350), // 0x227
	DAMAGE_REACTOR(0x353), // 0x22A
	TOUCH_REACTOR(0x22B),
	CLICK_REACTOR(0x22C),
	MAKE_EXTRACTOR(0x22F),
	UPDATE_ENV(0x17E),
	SNOWBALL(0x182),
	LEFT_KNOCK_BACK(0x183),
	CANDY_RANKING(0x185),
	START_EVOLUTION(0x186),
	COCONUT(0x999),
	SHIP_OBJECT(0x999),
	PARTY_SEARCH_START(0x197),
	PARTY_SEARCH_STOP(0x198),
	START_HARVEST(0x24E),
	STOP_HARVEST(0x24F),
	QUICK_MOVE(0x251),
	CS_UPDATE(0x28A),
	BUY_CS_ITEM(0x28B),
	COUPON_CODE(0x28C),
	CASH_CATEGORY(0x291),
	PLACE_FARM_OBJECT(0x278),
	FARM_SHOP_BUY(0x27D),
	FARM_COMPLETE_QUEST(0x281),
	FARM_NAME(0x282),
	HARVEST_FARM_BUILDING(0x283),
	USE_FARM_ITEM(0x284),
	RENAME_MONSTER(0x294),
	NURTURE_MONSTER(0x295),
	EXIT_FARM(0x299),
	FARM_QUEST_CHECK(0x29D),
	FARM_FIRST_ENTRY(0x2A7),
	GOLDEN_HAMMER(0x2A4),
	VICIOUS_HAMMER(0x1BD),
	PYRAMID_BUY_ITEM(0x999),
	CLASS_COMPETITION(0x999),
	MAGIC_WHEEL(0x2EB),
	REWARD(0x2EC),
	BLACK_FRIDAY(0x2BE),
	UPDATE_RED_LEAF(0x29C),

	CHANGE_FM_MAP(0x1C3), //UserTransferFreeMarketRequest
	//Not Placed:
	SPECIAL_STAT(0x10C),
	UPDATE_HYPER(0x171),
	RESET_HYPER(0x172),
	DRESSUP_TIME(0x17F),
	DF_COMBO(0x10F),
	BUTTON_PRESSED(0x1E3),
	OS_INFORMATION(0x1E6),
	LUCKY_LOGOUT(0x2B6),
	MESSENGER_RANKING(0x1DD);
	private short code = -2;

	public void setValue(short code) {
		this.code = code;
	}

	public void setValue(int code) {
		setValue((short) code);
	}

	public final short getValue() {
		return code;
	}

	private RecvPacketOpcode(short code) {
		this.code = code;
	}
	
	private RecvPacketOpcode(int code) {
		this.code = ((short) code);
	}

}
