package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		
		int numberOfRaccoonsInWoods = 3;
		int numberOfRaccoonsEatingDinner = 2;
		int numberOfRaccoonsLeftInWoods = numberOfRaccoonsInWoods - numberOfRaccoonsEatingDinner;
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int differenceBetweenFlowersAndBees = numberOfFlowers - numberOfBees;
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		
		int startingNumberOfPidgeonsEatingBreadcrumbs = 1;
		int additionalNumberOfPidgeonsEatingBreadcrumbs = 1;
		int finalNumberOfPidgeonsEatingBreadcrumbs = startingNumberOfPidgeonsEatingBreadcrumbs + additionalNumberOfPidgeonsEatingBreadcrumbs;
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		
		int originalNumberOfOwlsSittingOnFence = 3;
		int additionalNumberOfOwlsSittingOnFence = 2;
		int finalNumberOfOwlsSittingOnFence = originalNumberOfOwlsSittingOnFence + additionalNumberOfOwlsSittingOnFence;

        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		
		int numberOfBeaversWorkingOnHome = 2;
		int numberOfBeaversSwimming = 1;
		int numberOfBeaversStillWorkingOnHome = numberOfBeaversWorkingOnHome - numberOfBeaversSwimming;
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int numberOfToucansSittingOnATreeLimb = 2;
		int additionalNumberOfToucansSittingOnATreeLimb = 1;
		int finalNumberOfToucansSittingOnATreeLimb = numberOfToucansSittingOnATreeLimb + additionalNumberOfToucansSittingOnATreeLimb;
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		
		int numberOfSquirrelsInTree = 4;
		int numberOfNutsOnTree = 2;
		int differenceBetweenSquirrelsAndNuts = numberOfSquirrelsInTree - numberOfNutsOnTree;
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		
		int numberOfQuartersMrsHiltFound = 1;
		int numberOfDimesMrsHiltFound = 1;
		int numberOfNickelsMrsHiltFound = 2;
		int amountOfMoneyMrsHiltFoundInCents = (numberOfQuartersMrsHiltFound * 25) + (numberOfDimesMrsHiltFound * 10) + (numberOfNickelsMrsHiltFound * 5);

        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int numberOfMuffinsBakedByMrsBriersClass = 18;
		int numberOfMuffinsBakedByMrsMacAdamsClass = 20;
		int numberOfMuffinsBakedByMrsFlannerysClass = 17;
		int numberOfMuffinsBakedByFirstGrade = numberOfMuffinsBakedByMrsBriersClass + numberOfMuffinsBakedByMrsMacAdamsClass + numberOfMuffinsBakedByMrsFlannerysClass;
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		
		int costOfYoyoBoughtByMrsHiltInCents = 24;
		int costOfWhistleBoughtByMrsHiltInCents = 14;
		int totalSpentByMrsHiltInCents = costOfYoyoBoughtByMrsHiltInCents + costOfWhistleBoughtByMrsHiltInCents;

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		
		int numberOfLargeMarshmallowsUsedByMrsHilt = 8;
		int numberOfMiniMarshmallowsUsedByMrsHilt = 10;
		int totalNumberOfMarshmallowsUsedByMrsHilt = numberOfLargeMarshmallowsUsedByMrsHilt + numberOfMiniMarshmallowsUsedByMrsHilt;
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		
		int inchesOfSnowAtMrsHiltsHouse = 29;
		int inchesOfSnowAtBrecknockElementarySchool = 17;
		int differenceInInchesOfSnowBetweenMrsHiltsHouseAndBrecknockElementarySchool = inchesOfSnowAtMrsHiltsHouse - inchesOfSnowAtBrecknockElementarySchool;

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		
		int numberOfDollarsMrsHiltHasBeforePurchase = 10;
		int costOfToyTruckInDollars = 3;
		int costOfPencilCaseInDollars = 2;
		int numberOfDollarsMrsHiltHasAfterPurchase = numberOfDollarsMrsHiltHasBeforePurchase - (costOfToyTruckInDollars + costOfPencilCaseInDollars);
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		
		int numberOfMarblesJoshStartsWith = 16;
		int numberOfMarblesJoshLost = 7;
		int numberOfMarblesJoshCurrentlyHas = numberOfMarblesJoshStartsWith - numberOfMarblesJoshLost;
		

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int numberOfSeashellsMeganHas = 19;
		int numberOfSeashellsMeganWants = 25;
		int numberOfSeashellsMeganNeedsToCollect = numberOfSeashellsMeganWants - numberOfSeashellsMeganHas;

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		
		int totalNumberOfBalloonsBradHas = 17;
		int numberOfRedBalloonsBradHas = 8;
		int numberOfGreenBalloonsBradHas = totalNumberOfBalloonsBradHas - numberOfRedBalloonsBradHas;
	
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		
		int startingNumberOfBooksOnTheShelf = 38;
		int numberOfBooksAddedToShelfByMarta = 10;
		int finalNumberOfBooksOnTheShelf = startingNumberOfBooksOnTheShelf + numberOfBooksAddedToShelfByMarta;

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		
		int numberOfLegsBeeHas = 6;
		int numberOfBeesPresent = 8;
		int numberOfLegsOfMultipleBees = numberOfLegsBeeHas * numberOfBeesPresent;

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		
		int costOfIceCreamConeBoughtByMrsHiltInCents = 99;
		int iceCreamMultiplier = 2;
		int costOfMultipleIceCreamConesInCents = costOfIceCreamConeBoughtByMrsHiltInCents * iceCreamMultiplier;
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		
		int numberOfRocksMrsHiltNeedsToBorderHerGarden = 125;
		int numberOfRocksMrsHiltHasCurrently = 64;
		int numberOfRocksMrsHiltNeedstoAcquireToFinishHerBorder = numberOfRocksMrsHiltNeedsToBorderHerGarden - numberOfRocksMrsHiltHasCurrently;

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		
		int numberOfMarblesMrsHiltStartedWith = 38;
		int numberOfMarblesMrsHiltLost = 15;
		int numberOfMarblesMrsHiltHasLeft = numberOfMarblesMrsHiltStartedWith - numberOfMarblesMrsHiltLost;

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		
		int numberOfMilesMrsHiltAndSisterDroveToConcert = 78;
		int numberOfMilesTraveledByMrsHiltAndSisterBeforeStoppingForGas = 32;
		int numberOfMilesMrsHiltAndSisterHaveLeftToDrive = numberOfMilesMrsHiltAndSisterDroveToConcert - numberOfMilesTraveledByMrsHiltAndSisterBeforeStoppingForGas;

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		
		int amountOfTimeMrsHiltSpentShovelingSnowOnSaturdayMorningInMinutes = 90;
		int amountOfTimeMrsHiltSpentShovelingSnowOnSaturdayAfternoonInMinutes = 45;
		int totalAmountOftimeMrsHiltSpentShovelingSnowOnSaturdayInMinutes = amountOfTimeMrsHiltSpentShovelingSnowOnSaturdayMorningInMinutes + amountOfTimeMrsHiltSpentShovelingSnowOnSaturdayAfternoonInMinutes;

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		
		int numberOfHotDogsBoughtByMrsHilt = 6;
		int costOfHotDogsBoughtByMrsHiltInCents = 50;
		int totalCostOfAllHotDogsBoughtByMrsHiltInCents = numberOfHotDogsBoughtByMrsHilt * costOfHotDogsBoughtByMrsHiltInCents;

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		
		int amountOfMoneyMrsHiltHasInCents = 50;
		int costOfPencilInCents = 7;
		int totalNumberOfPencilsMrsHiltCanBuy = amountOfMoneyMrsHiltHasInCents / costOfPencilInCents;

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		
		int numberOfButterfliesMrsHiltSaw = 33;
		int numberOfButterfliesMrsHiltSawThatWereOrange = 20;
		int numberOfButterfliesMrsHiltSawThatWereRed = numberOfButterfliesMrsHiltSaw - numberOfButterfliesMrsHiltSawThatWereOrange;

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		
		int amountOfMoneyKateGaveClerkInCents = 100;
		int costOfCandyThatKateIsBuyingInCents = 54;
		int amountofChangeKateShouldReceiveInCents = amountOfMoneyKateGaveClerkInCents - costOfCandyThatKateIsBuyingInCents;

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		
		int currentNumberOfTreesInMarksBackyard = 13;
		int numberOfTreesThatMarkWantsToPlant = 12;
		int finalNumberOfTreesInMarksBackyard = currentNumberOfTreesInMarksBackyard + numberOfTreesThatMarkWantsToPlant;

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		
		int numberOfDaysUntilJoySeesHerGrandma = 2;
		int numberOfHoursInADay = 24;
		int numberOfHoursUntilJoySeesHerGrandma = numberOfDaysUntilJoySeesHerGrandma * numberOfHoursInADay;

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		
		int numberOfKimsCousins = 4;
		int numberOfPiecesOfGumKimWantsToGiveEachCousin = 5;
		int totalNumberOfPiecesOfGumKimNeeds = numberOfKimsCousins * numberOfPiecesOfGumKimWantsToGiveEachCousin;

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		
		int amountOfMoneyDanStartsWithInCents = 300;
		int costOfCandyBarDanBoughtInCents = 100;
		int amountOfMoneyDanHasLeftInCents = amountOfMoneyDanStartsWithInCents - costOfCandyBarDanBoughtInCents;

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		
		int numberOfBoatsInTheLake = 5;
		int numberOfPeopleOnEachBoat = 3;
		int totalNumberOfPeopleOnBoatsOnTheLake = numberOfBoatsInTheLake * numberOfPeopleOnEachBoat;

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		
		int numberOfLegosEllenStartsWith = 300;
		int numberOfLegosEllenLost = 57;
		int numberOfLegosEllenCurrentlyHas = numberOfLegosEllenStartsWith - numberOfLegosEllenLost;

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		
		int numberOfMuffinsArthurHasBaked = 35;
		int numberOfMuffinsArthurWantsToHave = 83;
		int numberOfMuffinsArthurStillHasToBake = numberOfMuffinsArthurWantsToHave - numberOfMuffinsArthurHasBaked;

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		
		int numberOfCrayonsThatWillyHas = 1400;
		int numberOfCrayonsThatLucyHas = 290;
		int differenceInNumberOfCrayonsBetweenWillyAndLucy = numberOfCrayonsThatWillyHas - numberOfCrayonsThatLucyHas;

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		
		int numberOfStickersPerPage = 10;
		int numberOfPagesWithStickers = 22;
		int totalNumberOfStickers = numberOfStickersPerPage * numberOfPagesWithStickers;

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		
		int numberOfCupcakesToShare = 96;
		int numberOfChildrenSharingCupcakes = 8;
		int numberOfCupcakesEachSharingChildWillGet = numberOfCupcakesToShare / numberOfChildrenSharingCupcakes;

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		
		int numberOfGingerbreadCookiesSheMade = 47;
		int numberOfJarsThatWillContainGingerbreadCookies = 6;
		int numberOfCookiesThatWillNotBeInJars = 47 % 6;

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		
		int numberOfCroissantsShePrepared = 59;
		int numberOfNeighborsReceivingCroissants = 8;
		int numberOfCroissantsLeftWithMarian = numberOfCroissantsShePrepared % numberOfNeighborsReceivingCroissants;

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		
		int numberOfCookiesMarianCanPlaceOnATray = 12;
		int numberOfCookiesMarianWantsToPrepareAtATime = 276;
		int numberOfTraysMarianNeeds = numberOfCookiesMarianWantsToPrepareAtATime / numberOfCookiesMarianCanPlaceOnATray;

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		
		int numberOfBiteSizedPretzelsMarianMade = 480;
		int numberOfBiteSizedPretzelsInAServing = 12;
		int numberOfServingsOfBiteSizedPretzelsMarianPrepared = numberOfBiteSizedPretzelsMarianMade / numberOfBiteSizedPretzelsInAServing;

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		
		int numberOfLemonCupcakesMarianBaked = 53;
		int numberOfLemonCupcakesPerBox = 3;
		int numberOfLemonCupcakesLeftAtHome = 2;
		int numberOfBoxesOfLemonCupcakesGivenAway = (numberOfLemonCupcakesMarianBaked - numberOfLemonCupcakesLeftAtHome) / numberOfLemonCupcakesPerBox;
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		
		int numberOfCarrotSticksSusiesMomPrepared = 74;
		int numberOfPeopleServedCarrotSticks = 12;
		int numberOfCarrotSticksLeftOver = numberOfCarrotSticksSusiesMomPrepared % numberOfPeopleServedCarrotSticks;

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		
		int numberOfTeddyBearsThatSusieAndHerSisterHave = 98;
		int numberOfTeddyBearsThatAShelfCanCarry = 7;
		int numberOfShelvesFilledWithTeddyBears = numberOfTeddyBearsThatSusieAndHerSisterHave / numberOfTeddyBearsThatAShelfCanCarry;

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		
		int numberOfFamilyPicturesSusiesMomHas = 480;
		int numberOfPicturesAnAlbumCanHold = 20;
		int numberOfAlbumsSusiesMomWillNeed = numberOfFamilyPicturesSusiesMomHas / numberOfPicturesAnAlbumCanHold;

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		
		int numberOfTradingCardsInJoesRoom = 94;
		int numberOfTradingCardsABoxCanHold = 8;
		int numberOfBoxesFullOfTradingCards = numberOfTradingCardsInJoesRoom / numberOfTradingCardsABoxCanHold;
		int numberOfCardsInUnfilledBox = numberOfTradingCardsInJoesRoom % numberOfTradingCardsABoxCanHold;
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		
		int numberOfShelvesInTheReadingRoom = 10;
		int numberOfBooksToGoOnTheShelves = 210;
		int numberOfBooksPerShelf = numberOfBooksToGoOnTheShelves / numberOfShelvesInTheReadingRoom;

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		
		int numberOfCroissantsCristinaBaked = 17;
		int numberOfGuestsReceivingCroissants = 7;
		int numberOfCroissantsPerGuest = numberOfCroissantsCristinaBaked / numberOfGuestsReceivingCroissants;

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		
		double roomSqFootage = 12 * 14;
		double billsBasePaintingTime = 2.15;
		double jillsBasePaintingTime = 1.90;
		double billsPaintingSpeedInSqFtPerHour = roomSqFootage / billsBasePaintingTime;
		double jillsPaintingSpeedInSqFtPerHour = roomSqFootage / jillsBasePaintingTime;
		double totalPaintingSpeedInSqFtPerHour = billsPaintingSpeedInSqFtPerHour + jillsPaintingSpeedInSqFtPerHour;
		double timeToPaint5RoomsInHours = (5 * roomSqFootage) / totalPaintingSpeedInSqFtPerHour;
		
		System.out.println(timeToPaint5RoomsInHours);
		
		double timeToPaint623RoomsInDays = ((623 * roomSqFootage) / totalPaintingSpeedInSqFtPerHour) / 8;
		
		System.out.println(timeToPaint623RoomsInDays);
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		
		String myFirstName = "Joshua";
		String myLastName = "DeSola";
		String myMiddleInitial1 = "A";
		String myMiddleInitial2 = "J";
		
		String myFullName = myLastName + ", " + myFirstName + " " + myMiddleInitial1 + "." + myMiddleInitial2 + ".";
		
		System.out.println(myFullName);


        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
		
		double distanceBetweenChicagoAndNewYorkInMiles = 800d;
		double distanceTraveledByTrainBetweenChicagoAndNewYorkInMiles = 537d;
		
		int percentageOfTripBetweenNewYorkAndChicagoTraveled = (int) ((distanceTraveledByTrainBetweenChicagoAndNewYorkInMiles / distanceBetweenChicagoAndNewYorkInMiles) * 100);
		
		System.out.println(percentageOfTripBetweenNewYorkAndChicagoTraveled + "%");



	}

}
