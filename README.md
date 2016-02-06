 - Game: Crazy Eights

 - Rules: This game was made using the rules defined by https://cardgames.io/crazyeights/

 - Instructions:
 	- In Terminal, cd into the crazyeights directory
 	- javac *.java
 	- java Main

 - Known errors: User input validation was not fully implemented.  Inputting in the wrong formats may cause the program to crash.

- Sample Run:

Carlos-MacBook-Pro:crazyeights carlosmo$ javac *.java
Carlos-MacBook-Pro:crazyeights carlosmo$ java Main
Let's play Crazy Eights!
Please enter your name: Carlos
Please enter your opponent's name: Baddy

*************************************************

Card in play:
TEN of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[JACK of CLUBS, SEVEN of DIAMONDS, EIGHT of DIAMONDS, QUEEN of DIAMONDS, FOUR of HEARTS, SEVEN of HEARTS, QUEEN of HEARTS, SIX of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): seven of diamonds

*************************************************
Baddy played a NINE of DIAMONDS

*************************************************

*************************************************

Card in play:
NINE of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[JACK of CLUBS, EIGHT of DIAMONDS, QUEEN of DIAMONDS, FOUR of HEARTS, SEVEN of HEARTS, QUEEN of HEARTS, SIX of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): queen of diamonds

*************************************************
Baddy played a QUEEN of SPADES

*************************************************

*************************************************

Card in play:
QUEEN of SPADES

Active suit:
SPADES

Carlos's hand:
[JACK of CLUBS, EIGHT of DIAMONDS, FOUR of HEARTS, SEVEN of HEARTS, QUEEN of HEARTS, SIX of SPADES]

Do you want to draw ('D') or play ('P')? P 
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): six of spades

*************************************************
Baddy played a SIX of DIAMONDS

*************************************************

*************************************************

Card in play:
SIX of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[JACK of CLUBS, EIGHT of DIAMONDS, FOUR of HEARTS, SEVEN of HEARTS, QUEEN of HEARTS]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): eight of diamonds
You played a Crazy Eight! Please declare a suit (CLUBS, DIAMONDS, HEARTS or SPADES): hearts

*************************************************
You declared HEARTS as the active suit.

*************************************************
Baddy played a EIGHT of HEARTS
Baddy declared HEARTS as the active suit.

*************************************************

*************************************************

Card in play:
EIGHT of HEARTS

Active suit:
HEARTS

Carlos's hand:
[JACK of CLUBS, FOUR of HEARTS, SEVEN of HEARTS, QUEEN of HEARTS]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): four of hearts

*************************************************
Baddy played a FOUR of DIAMONDS

*************************************************

*************************************************

Card in play:
FOUR of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[JACK of CLUBS, SEVEN of HEARTS, QUEEN of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a FOUR of SPADES

Card in play:
FOUR of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[JACK of CLUBS, SEVEN of HEARTS, QUEEN of HEARTS, FOUR of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): four of spades

*************************************************
Baddy played a FIVE of SPADES

*************************************************

*************************************************

Card in play:
FIVE of SPADES

Active suit:
SPADES

Carlos's hand:
[JACK of CLUBS, SEVEN of HEARTS, QUEEN of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a THREE of HEARTS

Card in play:
FIVE of SPADES

Active suit:
SPADES

Carlos's hand:
[JACK of CLUBS, THREE of HEARTS, SEVEN of HEARTS, QUEEN of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a FIVE of HEARTS

Card in play:
FIVE of SPADES

Active suit:
SPADES

Carlos's hand:
[JACK of CLUBS, THREE of HEARTS, FIVE of HEARTS, SEVEN of HEARTS, QUEEN of HEARTS]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): five of hearts

*************************************************
Baddy drew a card.
Baddy drew a card.
Baddy played a FIVE of DIAMONDS

*************************************************

*************************************************

Card in play:
FIVE of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[JACK of CLUBS, THREE of HEARTS, SEVEN of HEARTS, QUEEN of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a NINE of HEARTS

Card in play:
FIVE of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[JACK of CLUBS, THREE of HEARTS, SEVEN of HEARTS, NINE of HEARTS, QUEEN of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a TWO of CLUBS

Card in play:
FIVE of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[TWO of CLUBS, JACK of CLUBS, THREE of HEARTS, SEVEN of HEARTS, NINE of HEARTS, QUEEN of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a NINE of CLUBS

Card in play:
FIVE of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[TWO of CLUBS, NINE of CLUBS, JACK of CLUBS, THREE of HEARTS, SEVEN of HEARTS, NINE of HEARTS, QUEEN of HEARTS]

You have already drawn a maximum of 3 cards.
Do you want to play ('P') or skip ('S')? S

*************************************************
You have chosen to skip your turn.

*************************************************
Baddy played a THREE of DIAMONDS

*************************************************

*************************************************

Card in play:
THREE of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[TWO of CLUBS, NINE of CLUBS, JACK of CLUBS, THREE of HEARTS, SEVEN of HEARTS, NINE of HEARTS, QUEEN of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a SIX of CLUBS

Card in play:
THREE of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[TWO of CLUBS, SIX of CLUBS, NINE of CLUBS, JACK of CLUBS, THREE of HEARTS, SEVEN of HEARTS, NINE of HEARTS, QUEEN of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a KING of HEARTS

Card in play:
THREE of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[TWO of CLUBS, SIX of CLUBS, NINE of CLUBS, JACK of CLUBS, THREE of HEARTS, SEVEN of HEARTS, NINE of HEARTS, QUEEN of HEARTS, KING of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a THREE of CLUBS

Card in play:
THREE of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[TWO of CLUBS, THREE of CLUBS, SIX of CLUBS, NINE of CLUBS, JACK of CLUBS, THREE of HEARTS, SEVEN of HEARTS, NINE of HEARTS, QUEEN of HEARTS, KING of HEARTS]

You have already drawn a maximum of 3 cards.
Do you want to play ('P') or skip ('S')? S

*************************************************
You have chosen to skip your turn.

*************************************************
Baddy drew a card.
Baddy played a JACK of DIAMONDS

*************************************************

*************************************************

Card in play:
JACK of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[TWO of CLUBS, THREE of CLUBS, SIX of CLUBS, NINE of CLUBS, JACK of CLUBS, THREE of HEARTS, SEVEN of HEARTS, NINE of HEARTS, QUEEN of HEARTS, KING of HEARTS]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): jack of clubs

*************************************************
Baddy played a JACK of SPADES

*************************************************

*************************************************

Card in play:
JACK of SPADES

Active suit:
SPADES

Carlos's hand:
[TWO of CLUBS, THREE of CLUBS, SIX of CLUBS, NINE of CLUBS, THREE of HEARTS, SEVEN of HEARTS, NINE of HEARTS, QUEEN of HEARTS, KING of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a FIVE of CLUBS

Card in play:
JACK of SPADES

Active suit:
SPADES

Carlos's hand:
[TWO of CLUBS, THREE of CLUBS, FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, THREE of HEARTS, SEVEN of HEARTS, NINE of HEARTS, QUEEN of HEARTS, KING of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a THREE of SPADES

Card in play:
JACK of SPADES

Active suit:
SPADES

Carlos's hand:
[TWO of CLUBS, THREE of CLUBS, FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, THREE of HEARTS, SEVEN of HEARTS, NINE of HEARTS, QUEEN of HEARTS, KING of HEARTS, THREE of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): three of spades, three of clubs, three of hearts

*************************************************
Baddy drew a card.
Baddy drew a card.
Baddy drew a card.
Baddy played a EIGHT of CLUBS
Baddy declared CLUBS as the active suit.

*************************************************

*************************************************

Card in play:
EIGHT of CLUBS

Active suit:
CLUBS

Carlos's hand:
[TWO of CLUBS, FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, SEVEN of HEARTS, NINE of HEARTS, QUEEN of HEARTS, KING of HEARTS]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): two of clubs

*************************************************
Baddy played a TWO of SPADES

*************************************************

*************************************************

Card in play:
TWO of SPADES

Active suit:
SPADES

Carlos's hand:
[FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, SEVEN of HEARTS, NINE of HEARTS, QUEEN of HEARTS, KING of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a TEN of HEARTS

Card in play:
TWO of SPADES

Active suit:
SPADES

Carlos's hand:
[FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, SEVEN of HEARTS, NINE of HEARTS, TEN of HEARTS, QUEEN of HEARTS, KING of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a ACE of DIAMONDS

Card in play:
TWO of SPADES

Active suit:
SPADES

Carlos's hand:
[FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, ACE of DIAMONDS, SEVEN of HEARTS, NINE of HEARTS, TEN of HEARTS, QUEEN of HEARTS, KING of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a TEN of CLUBS

Card in play:
TWO of SPADES

Active suit:
SPADES

Carlos's hand:
[FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, TEN of CLUBS, ACE of DIAMONDS, SEVEN of HEARTS, NINE of HEARTS, TEN of HEARTS, QUEEN of HEARTS, KING of HEARTS]

You have already drawn a maximum of 3 cards.
Do you want to play ('P') or skip ('S')? S

*************************************************
You have chosen to skip your turn.

*************************************************
Baddy played a TWO of DIAMONDS

*************************************************

*************************************************

Card in play:
TWO of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, TEN of CLUBS, ACE of DIAMONDS, SEVEN of HEARTS, NINE of HEARTS, TEN of HEARTS, QUEEN of HEARTS, KING of HEARTS]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a EIGHT of SPADES

Card in play:
TWO of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, TEN of CLUBS, ACE of DIAMONDS, SEVEN of HEARTS, NINE of HEARTS, TEN of HEARTS, QUEEN of HEARTS, KING of HEARTS, EIGHT of SPADES]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a KING of SPADES

Card in play:
TWO of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, TEN of CLUBS, ACE of DIAMONDS, SEVEN of HEARTS, NINE of HEARTS, TEN of HEARTS, QUEEN of HEARTS, KING of HEARTS, EIGHT of SPADES, KING of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): ace of diamonds

*************************************************
Baddy drew a card.
Baddy played a ACE of HEARTS

*************************************************

*************************************************

Card in play:
ACE of HEARTS

Active suit:
HEARTS

Carlos's hand:
[FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, TEN of CLUBS, SEVEN of HEARTS, NINE of HEARTS, TEN of HEARTS, QUEEN of HEARTS, KING of HEARTS, EIGHT of SPADES, KING of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): seven of hearts

*************************************************
Baddy drew a card.
Baddy drew a card.
Baddy drew a card.
Baddy skipped their turn.

*************************************************

*************************************************

Card in play:
SEVEN of HEARTS

Active suit:
HEARTS

Carlos's hand:
[FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, TEN of CLUBS, NINE of HEARTS, TEN of HEARTS, QUEEN of HEARTS, KING of HEARTS, EIGHT of SPADES, KING of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): ten of hearts

*************************************************
Baddy played a TEN of SPADES

*************************************************

*************************************************

Card in play:
TEN of SPADES

Active suit:
SPADES

Carlos's hand:
[FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, TEN of CLUBS, NINE of HEARTS, QUEEN of HEARTS, KING of HEARTS, EIGHT of SPADES, KING of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): king of spades

*************************************************
Baddy played a KING of CLUBS

*************************************************

*************************************************

Card in play:
KING of CLUBS

Active suit:
CLUBS

Carlos's hand:
[FIVE of CLUBS, SIX of CLUBS, NINE of CLUBS, TEN of CLUBS, NINE of HEARTS, QUEEN of HEARTS, KING of HEARTS, EIGHT of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): five of clubs

*************************************************
Baddy played a FOUR of CLUBS

*************************************************

*************************************************

Card in play:
FOUR of CLUBS

Active suit:
CLUBS

Carlos's hand:
[SIX of CLUBS, NINE of CLUBS, TEN of CLUBS, NINE of HEARTS, QUEEN of HEARTS, KING of HEARTS, EIGHT of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): six of clubs

*************************************************
Baddy drew a card.
Baddy drew a card.
Baddy played a SEVEN of CLUBS

*************************************************

*************************************************

Card in play:
SEVEN of CLUBS

Active suit:
CLUBS

Carlos's hand:
[NINE of CLUBS, TEN of CLUBS, NINE of HEARTS, QUEEN of HEARTS, KING of HEARTS, EIGHT of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): ten of clubs

*************************************************
Baddy drew a card.
Baddy drew a card.
Baddy drew a card.
Baddy played a ACE of CLUBS

*************************************************

*************************************************

Card in play:
ACE of CLUBS

Active suit:
CLUBS

Carlos's hand:
[NINE of CLUBS, NINE of HEARTS, QUEEN of HEARTS, KING of HEARTS, EIGHT of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): nine of club, nine of hearts
Exception in thread "main" java.lang.IllegalArgumentException: No enum constant Suit.CLUB
	at java.lang.Enum.valueOf(Enum.java:236)
	at Suit.valueOf(Suit.java:8)
	at HumanPlayer.move(HumanPlayer.java:102)
	at Main.main(Main.java:37)
Carlos-MacBook-Pro:crazyeights carlosmo$ clear

Carlos-MacBook-Pro:crazyeights carlosmo$ javac *.java
Carlos-MacBook-Pro:crazyeights carlosmo$ java Main
Let's play Crazy Eights!
Please enter your name: Carlos
Please enter your opponent's name: Baddy

*************************************************

Card in play:
TEN of CLUBS

Active suit:
CLUBS

Carlos's hand:
[ACE of DIAMONDS, FIVE of HEARTS, JACK of HEARTS, KING of HEARTS, FOUR of SPADES, SIX of SPADES, NINE of SPADES, KING of SPADES]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a TEN of HEARTS

Card in play:
TEN of CLUBS

Active suit:
CLUBS

Carlos's hand:
[ACE of DIAMONDS, FIVE of HEARTS, TEN of HEARTS, JACK of HEARTS, KING of HEARTS, FOUR of SPADES, SIX of SPADES, NINE of SPADES, KING of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): ten of hearts

*************************************************
Baddy played a TWO of HEARTS

*************************************************

*************************************************

Card in play:
TWO of HEARTS

Active suit:
HEARTS

Carlos's hand:
[ACE of DIAMONDS, FIVE of HEARTS, JACK of HEARTS, KING of HEARTS, FOUR of SPADES, SIX of SPADES, NINE of SPADES, KING of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): five of hearts

*************************************************
Baddy played a FIVE of DIAMONDS

*************************************************

*************************************************

Card in play:
FIVE of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[ACE of DIAMONDS, JACK of HEARTS, KING of HEARTS, FOUR of SPADES, SIX of SPADES, NINE of SPADES, KING of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): ace of diamonds

*************************************************
Baddy played a KING of DIAMONDS

*************************************************

*************************************************

Card in play:
KING of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[JACK of HEARTS, KING of HEARTS, FOUR of SPADES, SIX of SPADES, NINE of SPADES, KING of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): king of spades, king of hearts

*************************************************
Baddy played a THREE of HEARTS

*************************************************

*************************************************

Card in play:
THREE of HEARTS

Active suit:
HEARTS

Carlos's hand:
[JACK of HEARTS, FOUR of SPADES, SIX of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): jack of hearts

*************************************************
Baddy drew a card.
Baddy drew a card.
Baddy drew a card.
Baddy played a SEVEN of HEARTS

*************************************************

*************************************************

Card in play:
SEVEN of HEARTS

Active suit:
HEARTS

Carlos's hand:
[FOUR of SPADES, SIX of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a ACE of HEARTS

Card in play:
SEVEN of HEARTS

Active suit:
HEARTS

Carlos's hand:
[ACE of HEARTS, FOUR of SPADES, SIX of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): ace of hearts

*************************************************
Baddy drew a card.
Baddy played a ACE of SPADES

*************************************************

*************************************************

Card in play:
ACE of SPADES

Active suit:
SPADES

Carlos's hand:
[FOUR of SPADES, SIX of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): four of spades

*************************************************
Baddy played a FOUR of CLUBS

*************************************************

*************************************************

Card in play:
FOUR of CLUBS

Active suit:
CLUBS

Carlos's hand:
[SIX of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a KING of CLUBS

Card in play:
FOUR of CLUBS

Active suit:
CLUBS

Carlos's hand:
[KING of CLUBS, SIX of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): king of clubs

*************************************************
Baddy played a SEVEN of CLUBS

*************************************************

*************************************************

Card in play:
SEVEN of CLUBS

Active suit:
CLUBS

Carlos's hand:
[SIX of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a THREE of SPADES

Card in play:
SEVEN of CLUBS

Active suit:
CLUBS

Carlos's hand:
[THREE of SPADES, SIX of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a TEN of DIAMONDS

Card in play:
SEVEN of CLUBS

Active suit:
CLUBS

Carlos's hand:
[TEN of DIAMONDS, THREE of SPADES, SIX of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a SEVEN of SPADES

Card in play:
SEVEN of CLUBS

Active suit:
CLUBS

Carlos's hand:
[TEN of DIAMONDS, THREE of SPADES, SIX of SPADES, SEVEN of SPADES, NINE of SPADES]

You have already drawn a maximum of 3 cards.
Do you want to play ('P') or skip ('S')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): seven of spades

*************************************************
Baddy drew a card.
Baddy played a TEN of SPADES

*************************************************

*************************************************

Card in play:
TEN of SPADES

Active suit:
SPADES

Carlos's hand:
[TEN of DIAMONDS, THREE of SPADES, SIX of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): ten of diamonds

*************************************************
Baddy played a SIX of DIAMONDS

*************************************************

*************************************************

Card in play:
SIX of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[THREE of SPADES, SIX of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): six of spades

*************************************************
Baddy drew a card.
Baddy drew a card.
Baddy played a EIGHT of HEARTS
Baddy declared HEARTS as the active suit.

*************************************************

*************************************************

Card in play:
EIGHT of HEARTS

Active suit:
HEARTS

Carlos's hand:
[THREE of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a NINE of DIAMONDS

Card in play:
EIGHT of HEARTS

Active suit:
HEARTS

Carlos's hand:
[NINE of DIAMONDS, THREE of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a FOUR of DIAMONDS

Card in play:
EIGHT of HEARTS

Active suit:
HEARTS

Carlos's hand:
[FOUR of DIAMONDS, NINE of DIAMONDS, THREE of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a JACK of DIAMONDS

Card in play:
EIGHT of HEARTS

Active suit:
HEARTS

Carlos's hand:
[FOUR of DIAMONDS, NINE of DIAMONDS, JACK of DIAMONDS, THREE of SPADES, NINE of SPADES]

You have already drawn a maximum of 3 cards.
Do you want to play ('P') or skip ('S')? S

*************************************************
You have chosen to skip your turn.

*************************************************
Baddy drew a card.
Baddy drew a card.
Baddy played a EIGHT of DIAMONDS
Baddy declared DIAMONDS as the active suit.

*************************************************

*************************************************

Card in play:
EIGHT of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[FOUR of DIAMONDS, NINE of DIAMONDS, JACK of DIAMONDS, THREE of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): four of diamonds

*************************************************
Baddy played a THREE of DIAMONDS

*************************************************

*************************************************

Card in play:
THREE of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[NINE of DIAMONDS, JACK of DIAMONDS, THREE of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): jack of diamonds

*************************************************
Baddy played a TWO of DIAMONDS

*************************************************

*************************************************

Card in play:
TWO of DIAMONDS

Active suit:
DIAMONDS

Carlos's hand:
[NINE of DIAMONDS, THREE of SPADES, NINE of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): nine of diamonds, nine of spades

*************************************************
Baddy played a NINE of CLUBS

*************************************************

*************************************************

Card in play:
NINE of CLUBS

Active suit:
CLUBS

Carlos's hand:
[THREE of SPADES]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a QUEEN of CLUBS

Card in play:
NINE of CLUBS

Active suit:
CLUBS

Carlos's hand:
[QUEEN of CLUBS, THREE of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): queen of clubs

*************************************************
Baddy played a FIVE of CLUBS

*************************************************

*************************************************

Card in play:
FIVE of CLUBS

Active suit:
CLUBS

Carlos's hand:
[THREE of SPADES]

Do you want to draw ('D') or play ('P')? D

*************************************************
You drew a ACE of CLUBS

Card in play:
FIVE of CLUBS

Active suit:
CLUBS

Carlos's hand:
[ACE of CLUBS, THREE of SPADES]

Do you want to draw ('D') or play ('P')? P
Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): ace of clubs

*************************************************
Baddy played a TWO of CLUBS

*************************************************

Sorry. Baddy wins the game.
Carlos-MacBook-Pro:crazyeights carlosmo$ 
