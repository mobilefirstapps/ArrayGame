package com.example.arraygame;

import android.app.Application;
import android.util.Log;

public class GlobalThings extends Application {
	
	public static boolean music =true;

	@Override
	public void onLowMemory() {
		// TODO Auto-generated method stub
		Log.e("eeeeeeeeeeeeeeeeeeeeeeeeee", "sfsdkjflkdsjfdlksjfldskfjdsl");
	}

	static String[] TypeEasy = { "i", "i", "i", "i", "i", "i", "i", "i", "i",
			"i", "i", "i", "i", "i", "i", "i", "i", "i", "t", "t", "t", "t",
			"t", "t", "t" };

	static String[] ImageEasy = {
			"https://lh5.googleusercontent.com/FArY_Me0sFfd72Vs5u8QJXRMLP7jRqHZ2KxqiaiaGw=w636-h720-no",
			"https://lh3.googleusercontent.com/uJTRl_UU1mTLB_s1gKj-_7meAYKvEUd8rRBQIuSQQg=w499-h750-no",
			"https://lh3.googleusercontent.com/9blqk0HhXGTa9DevQR289XWMC7wml94MAnqrWSnkKe8=w215-h330-p-no",
			"https://lh4.googleusercontent.com/gwt4OlJ_JuE-jX5Pk41kt70PwQDvz6flzBcL1SyyyQ=w608-h829-no",
			"https://lh5.googleusercontent.com/fcFiUZRGzS-dhz-J1U152diCafPkVD00C9VXAnvr6E0=w640-h426-no",
			"https://lh5.googleusercontent.com/g6oJWwi9MeIur66M69WB6pe40Dt_8Fmm4KEvw-SS9mw=w300-h450-no",
			"https://lh3.googleusercontent.com/yO7-2bC6AkFL86YMVh8ykZwnf9eA46zHnrwBsESuUSI=s450-no",
			"https://lh3.googleusercontent.com/-azUmeBpcoAs/VSeuSf-QcfI/AAAAAAAAAI8/_rIog1FBV5Y/w640-h360-no/CatlynStark.jpg",
			"https://lh4.googleusercontent.com/TrR5bvm0VkfSVTf33zCkIfeSlNSXO6IStmRG6r_UuwU=w200-h300-no",
			"https://lh4.googleusercontent.com/aLqFp8x2wDpV0YDeSe6mCM9QyuGi8gtDBhmCshEf4PM=s400-no",
			"https://lh6.googleusercontent.com/rTw1Fc22XzCJhTXeieYTpcJKxdnVFugP_mlFn6ynZVw=w460-h276-no",
			"https://lh3.googleusercontent.com/9HxYHXbRp1ooWDNfPo4MBXm1tJbLrYeQUG_W0bSOQDo=w366-h528-no",
			"https://lh6.googleusercontent.com/JjTnNi0B0U6-9_rnmJIWhhnrSYi2GaOCSFH-pkxwUP4=w332-h416-no",
			"https://lh5.googleusercontent.com/UVrpV_gJsinNTM4JL4QE3Ad_WQdVkOBUb9hib1U4uB0=w550-h310-no",
			"https://lh4.googleusercontent.com/D9vupA4tRDzXqbMw6y6l7D--MA_-XAu13gpwmjCAD8s=w553-h653-no",
			"https://lh6.googleusercontent.com/KmmIDpnUOOSjHNKHS2f2RcOEHUSzhFBkcom1K4qeDdc=s512-no",
			"https://lh4.googleusercontent.com/8P7r4w-4eI7lr8qw6627zPrUmdz8J4JQWekgP18_g04=w320-h400-no",
			"https://lh3.googleusercontent.com/9fVShYAe_mnDo5RB-VKWuqQvVTxWAWk-bZbaUy8fYV4=w460-h286-no",
			"", "", "", "", "", "", "" };

	static String[] TextEasy = {
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"You know nothing, Jon Snow",
			"Littlefinger &  Master of Coin",
			"Mother of Dragons",
			"NEITHER GODS NOR MEN WILL EVER COMPEL ME TO LET YOU TURN CASTERLY ROCK INTO YOUR WHOREHOUSE.",
			"A DRAGON IS NOT A SLAVE.", "THE THINGS I DO FOR LOVE.",
			"IT'S THE FAMILY NAME THAT LIVES ON. IT'S ALL THAT LIVES ON." };

	static String[] AnswerEasy = { "Theon Greyjoy", "Margaery Tyrell",
			"Sansa Stark", "Varys", "Arya Stark", "Tyrion Lannister",
			"Eddard Stark", "Catelyn Stark", "Jon Snow", "Tywin Lannister",
			"Hound", "Joffrey Baratheon", "Cersei Lannister", "Robb Stark",
			"Hodor", "House Stark", "kHal Drogo", "The Mountain", "ygritte",
			"Petyr Baelish", "Daenerys Targaryen", "Tyrion", "Daenerys",
			"Jaime Lannister", "Tywin Lannister" };

	static String[] typeMed = { "i", "i", "i", "i", "i", "i", "i", "i", "i",
			"i", "i", "i", "i", "i", "i", "i", "i", "t", "t", "t", "t", "t",
			"t", "t", "t", "t", "t", "t", "t", "t" };

	static String[] imagemed = {
			"https://lh5.googleusercontent.com/-kRwxpvmEGdw/VSexqbogdMI/AAAAAAAAAL0/EVBuQfp4cMI/w500-h400-no/Renly-Baratheon-house-baratheon-30540977-500-400.png",
			"https://lh6.googleusercontent.com/WcEalYN-ntgcVpPAQ5UEvqRO9FjYy23i0YW8b57J2yo=w455-h641-no",
			"https://lh3.googleusercontent.com/79Ya9P2XKj3mxxryR8d0_RRdlu5uF-eayWkcYW0tDI8=w516-h718-no",
			"https://lh6.googleusercontent.com/lBt1Px8tzWyGPGoxh6bS2NezecWA8LsR9wOiC44hQD4=w500-h703-no",
			"https://lh5.googleusercontent.com/yqbzO6HuHQcG7DXZLbC-MwPu3P-Xiaw8cbMNgDnm_40=w600-h345-no",
			"https://lh6.googleusercontent.com/z6DCGvkmA12iZBhfSXEgm5S58c80NQj-TTdhnHynZjY=w610-h343-no",
			"https://lh6.googleusercontent.com/T_6jBAGiFZktYP6F6V3y8RDfElm_ZpAIc0hzNUFVm20=w400-h322-no",
			"https://lh3.googleusercontent.com/pPP6ADj5Kd9gnU1YctTxFsCuhX-kVKBfXBWYgSNL82s=s500-no",
			"https://lh3.googleusercontent.com/8kGd2lLD537BTbELbX_5guXHPr_f_ehf88j-xYlu21c=w500-h744-no",
			"https://lh3.googleusercontent.com/9WcxnJ-ssNbny_8ET9bseNUpJzXiTJdWjMXrRLwHgpM=s450-no",
			"https://lh3.googleusercontent.com/WHPuWqTPzycPsXZyqALoKMDIdDQ-0X1MQLu2aUHNjAU=w600-h338-no",
			"https://lh5.googleusercontent.com/-esnFsT-6spI/VSe0w56ZPDI/AAAAAAAAAOs/XAwZ9BEngeg/w486-h265-no/MelisandreSlider.jpg",
			"https://lh4.googleusercontent.com/0yHCn7vIx0edlXZgm0-xIPEUkPOjCmXSOu959qMs5e4=s800-no",
			"https://lh4.googleusercontent.com/mxeyCoH5qpWhTtXPgL8uM69dGMPxaAepijKhhRiJ9cM=s512-no",
			"https://lh6.googleusercontent.com/hztk4Gohq-4bP95m-R4IovpN1hSwJU0pzedDZwtAEaM=w1366-h768-no",
			"https://lh4.googleusercontent.com/cOgbUtWPRHgWruT4VbO2_--3IHoLUy5qIvLaBuTO8AM=s512-no",
			"https://lh4.googleusercontent.com/NSrTRWH8sYL7_8FWC0JZkgylcjY31Lp-ze31GgmUMtg=s512-no",
			"", "", "", "", "", "", "", "", "", "", "", "", "" };

	static String[] textmed = {
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"when you play a game of thrones you win or you die",
			"IF YOU EVER CALL ME SISTER AGAIN, I'LL HAVE YOU STRANGLED IN YOUR SLEEP",
			"You can't talk to me like that. The king can do as he likes!",
			"Power resides where men believe it resides.It's a trick, a shadow on the wall.And a very small man can cast a very large shadow.",
			"Fear cuts deeper then swords.",
			"I LEARNED HOW TO DIE A LONG TIME AGO.",
			"THE MAN WHO PASSES THE SENTENCE SHOULD SWING THE SWORD.",
			"TURN US AWAY, AND WE WILL BURN YOU FIRST.",
			"I PRAYED TO THE GODS 'TAKE HIM AWAY, MAKE HIM DIE.",
			"I swear to you  sitting a throne is a thousand times harder than winning one",
			"I'm the watcher on The Wall.",
			"There is only one god and his name is Death. And there is only one thing we say to Death: Not today.",
			"A Lannister Always Pays His Debts" };

	static String[] ansmed = { "Renly Baratheon", "Olenna Tyrell",
			"Walder Frey", "Jamie Lannister", "White Walker", "Shae",
			"Bran Stark", "Stannis Baratheon", "brienne", "Davos Seaworth",
			"Missandei", "Melisandre", "Gendry", "Oberyn Martell",
			"Valar Morghulis", "House Lannister", "House Targaryen",
			"Cersei Lannister", "Cersei", "Joffrey Baratheon", "Varys",
			"Arya Stark", "Eddard Stark", "Eddard Stark", "Daenerys",
			"Catelyn Stark", "Robert Baratheon", "Jon Snow", "Syrio Forel",
			"Tyrion Lannister" };

	static String[] typehard = { "i", "t", "i", "i", "i", "i", "t", "i", "i",
			"t", "i", "i", "i", "i", "i", "i", "i", "t", "t", "t", "t", "t",
			"t" };

	static String[] imagehard = {
			"https://lh4.googleusercontent.com/VCCAR7VyAvKAQxapOXHx6akPU7Hd_EpqF2_F39E6r54=w375-h547-no",
			"",
			"https://lh4.googleusercontent.com/-UbKUNUjMcmw/VSe3dohLIuI/AAAAAAAAAQY/4Qgkm2lBa70/w250-h375-no/Samwell%2BTarly.png",
			"https://lh4.googleusercontent.com/nJL1z2tZ3ugHYcw_tuxZuM_xskN0IW3lEWSGg7ZneZI=w720-h404-no",
			"https://lh4.googleusercontent.com/MoPLfqmPeDATWz6gwQc73GrdUcCL4uUJu0-5ax26PXc=s800-no",
			"https://lh4.googleusercontent.com/ap7iNUKAVuld-9zCQv6n7vga6yTn0uYKIM822C4XE2E=w512-h717-no",
			"",
			"https://lh3.googleusercontent.com/2RY7_zNWpKdZljCXdhRpB0OPPv_z_mIJpVXvV6ZLN94=w716-h673-no",
			"https://lh5.googleusercontent.com/9KRVcZphfe2ia2NOVEfHN4Gp5aqmASnnnunw53B_dxM=w500-h281-no",
			"",
			"https://lh3.googleusercontent.com/g5Rc7hNB5AuU9UhQ1DaCx_WLqyfMXqVPNDMHf5MXG6I=w500-h584-no",
			"https://lh5.googleusercontent.com/-dzth46kTcaE/VSe5LVpn2QI/AAAAAAAAASI/UjgTM2zGzI4/w640-h360-no/lysa_arryn.jpg",
			"https://lh3.googleusercontent.com/-H1UAmaruAOU/VSe5bFt0hAI/AAAAAAAAASY/1Dg9d1qLcIk/w535-h770-no/Roose-Bolton.jpg",
			"https://lh3.googleusercontent.com/-TbnrsflSUdE/VSe5y3oVWRI/AAAAAAAAASo/t4JHuOjb1mo/w403-h400-no/TalishaStark.jpg",
			"https://lh3.googleusercontent.com/Ljlmc8YhVoIuPaDKLecEjLAPxtmrtanBN0v43iOrEK0=w368-h555-no",
			"https://lh4.googleusercontent.com/-hmMeDmm9VIo/VSe6Tx--coI/AAAAAAAAATI/Wm0srOaTxHk/w500-h281-no/Osha.png",
			"https://lh3.googleusercontent.com/Y4y8l-I9rRZfRHSWF54c0O3E-iIIaCdhcWOqMeMMSms=w515-h287-no",
			"", "", "", "", "", "" };

	static String[] texthard = {
			"",
			"The next time we see each other, we'll talk about your mother. I promise.",
			"",
			"",
			"",
			"",
			"A mind needs books as a sword needs a whetstone, if it is to keep its edge.",
			"",
			"",
			"War was easier than daughters.",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"Money buys a man's silence for a time.A bolt in the heart buys it forever.",
			"The Mad King Did Aa He Liked. Has Your Uncle Jaime Ever Told You What Happened To Him?",
			"The next time you raise a hand to me will be the last time you have hands!",
			"Your Joy Will Turn to ashes in your mouth",
			"The Lannisters Send Their Regards",
			"Chaos Isn't A Pit. Chaos Is A Ladder" };

	static String[] answerhard = { "Jorah Mormont", "Eddard Stark",
			"Samwell Tarly", "Ramsay Snow", "Baratheon", "Syrio Forel",
			"Tyrion Lannister", "Needle", "Viserys Targaryen", "Eddard Stark",
			"Shireen Baratheon", "Lysa Arryn", "Roose Bolton", "Talisa",
			"Hot Pie", "Osha", "Grey Worm", "Petyr Baelish",
			"Tyrion Lannister", "Daenerys", "Tyrion Lannister", "Roose Bolton",
			"Petyr Baelish" };

	static String[] typevhard = { "i", "i", "i", "i", "i", "i", "t", "i", "i",
			"t", "t" };

	static String[] imagevhard = {
			"https://lh4.googleusercontent.com/tNV08UxPwElkPovmHtEtPD_IfSc-wXxB4AnXbg-xM1c=w400-h300-no",
			"https://lh3.googleusercontent.com/-xUw3WypfJdY/VSe7QG5GuFI/AAAAAAAAAT4/JCcgzk9ur2g/w551-h828-no/Yara_Greyjoy.png",
			"https://lh3.googleusercontent.com/-bItg3w6NLMI/VSe7jsIVNNI/AAAAAAAAAUI/lsADoCwrYVQ/w320-h240-no/Pycelle.jpg",
			"https://lh6.googleusercontent.com/-xntO-mbb1a8/VSfBNS2EmSI/AAAAAAAAAWA/1qZtxRy8Fx0/w500-h281-no/Robert_Arry.jpg",
			"https://lh4.googleusercontent.com/-ER29tgn9E14/VSe9TEUbIkI/AAAAAAAAAUo/mpqAa5QzihE/w337-h481-no/Selyse%2BBaratheon.jpg",
			"https://lh6.googleusercontent.com/f6D7TquK2rPfa-o35EqFA0HLUuXWGvrfy6I7dnFcVCo=w486-h324-no",
			"",
			"https://lh3.googleusercontent.com/TCnVmfEudL7P_03G5n74PYnWKJd4lxG7miIGfjo42Lo=s829-no",
			"https://lh3.googleusercontent.com/B8-sawa8I8u7xiCzmVGkcOrqs6tp7A31NrvEI0XB6BA=w500-h281-no",
			"", "" };

	static String[] textvhard = {
			"",
			"",
			"",
			"",
			"",
			"",
			"Storms come and go, the big fish eat the little fish, and I keep on paddling.",
			"",
			"",
			"What good is the word extravagant if it can't be used to describe a royal wedding?",
			"When Dead Men And Worse Come Hunting.You Think It Matters Who Sits On The Iron Throne?" };

	static String[] answervhard = { "Aarakh", "Yara Greyjoy", "Pycelle",
			"Robert Arryn", "Selyse Baratheon", "Salladhor Saan", "Varys",
			"House Martell", "Rickon Stark", "Olenna Tyrell", "Jorah Mormont" };

}