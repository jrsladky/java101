/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch05/elders/Hastur.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch05.elders;

import com.java101.hfdp.ch05.elders.characteristic.AllStarTeam;
import com.java101.hfdp.ch05.elders.characteristic.Elders;
import com.java101.hfdp.ch05.elders.characteristic.Position;

/**
 *  Represents the King in Yellow, who is awake, insanity causing, and world eating.
 *  Yikes.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/14 11:45:26 $ by $Author: crosta $	
 */
public final class Hastur extends ElderOne {

	public Hastur(String name, String nickname, String author, String description) {
		super(Elders.HASTUR);

		setName(name);
		setNickname(nickname);
		setAuthor(author);
		setDescription(description);

		setAllStarTeam(AllStarTeam.WEST);
		setPosition(Position.FORWARD);
	}

}