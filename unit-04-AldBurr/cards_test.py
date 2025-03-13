import cards
def test_make_card():
    rank = 14
    suit = "Spades"
    expected = (14, "Spades", "Ace of Spades", "AS")
    actual = cards.make_card(rank, suit)
    assert actual == expected