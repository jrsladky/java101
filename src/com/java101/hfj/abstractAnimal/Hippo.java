/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/abstractAnimal/Hippo.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.abstractAnimal;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public class Hippo extends Mammal {

	@Override
	public String makeNoise() {
		return "hippo grunt";
	}


	@Override
	public String eat() {
		return "hippo chomp!";
	}
}
