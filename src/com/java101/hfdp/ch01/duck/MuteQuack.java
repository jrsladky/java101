/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch01/duck/MuteQuack.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch01.duck;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("The sound of silence.");
	}
}
