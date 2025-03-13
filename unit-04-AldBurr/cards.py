def make_card(rank, suit):
    if rank > 14 or rank < 2:
        return ("Rank Invalid")
    elif suit.lower() == "spades" or suit.lower() == "clubs" or suit.lower() == "hearts" or suit.lower() == "diamonds":
        if (rank == 11):
            if(suit.lower() == "spades"):
                return (rank, suit, ("Jack of "+ suit), ("JS"))
            elif(suit.lower() == "clubs"):
                return (rank, suit, ("Jack of "+ suit), ("JC"))
            elif(suit.lower() == "hearts"):
                return (rank, suit, ("Jack of "+ suit), ("JH"))
            elif(suit.lower() == "diamonds"):
                return (rank, suit, ("Jack of "+ suit), ("JD"))
        elif (rank == 12):
            if(suit.lower() == "spades"):
                return (rank, suit, ("Queen of "+ suit), ("QS"))
            elif(suit.lower() == "clubs"):
                return (rank, suit, ("Queen of "+ suit), ("QC"))
            elif(suit.lower() == "hearts"):
                return (rank, suit, ("Queen of "+ suit), ("QH"))
            elif(suit.lower() == "diamonds"):
                return (rank, suit, ("Queen of "+ suit), ("QD"))
        elif (rank == 13):
            if(suit.lower() == "spades"):
                return (rank, suit, ("King of "+ suit), ("KS"))
            elif(suit.lower() == "clubs"):
                return (rank, suit, ("King of "+ suit), ("KC"))
            elif(suit.lower() == "hearts"):
                return (rank, suit, ("King of "+ suit), ("KH"))
            elif(suit.lower() == "diamonds"):
                return (rank, suit, ("King of "+ suit), ("KD"))
        elif (rank == 14):
            if(suit.lower() == "spades"):
                return (rank, suit, ("Ace of "+ suit), ("AS"))
            elif(suit.lower() == "clubs"):
                return (rank, suit, ("Ace of "+ suit), ("AC"))
            elif(suit.lower() == "hearts"):
                return (rank, suit, ("Ace of "+ suit), ("AH"))
            elif(suit.lower() == "diamonds"):
                return (rank, suit, ("Ace of "+ suit), ("AD"))
        else:
            if(suit.lower() == "spades"):
                return (rank, suit, (str(rank) + " of "+ str(suit)), (str(rank) + "S"))
            elif(suit.lower() == "clubs"):
                return (rank, suit, (str(rank) + " of "+ str(suit)), (str(rank) + "C"))
            elif(suit.lower() == "hearts"):
                return (rank, suit, (str(rank) + " of "+ str(suit)), (str(rank) + "H"))
            elif(suit.lower() == "diamonds"):
                return (rank, suit, (str(rank) + " of "+ str(suit)), (str(rank) + "D"))\

#print(make_card(14, "Spades"))
