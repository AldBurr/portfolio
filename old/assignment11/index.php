<?php $currentPage = "The Most Populous City"; ?>
<!DOCTYPE html>

<html lang="en">

<?php include "inc/head.php"; ?>

<body class="page-container">

<?php include "inc/header.php"; ?>

<?php include "inc/nav.php"; ?>

  <section id="city-info" class="container">
    <div>
      <h2>Introduction</h2>
      <p>New York is the most populous city in the United States and the center of the New York Metropolitan Area, one of the most populous urban agglomerations in the world. The city is referred to as New York City or the City of New York to distinguish it from the State of New York, of which it is a part. A global power city, New York exerts a significant impact upon commerce, finance, media, art, fashion, research, technology, education, and entertainment. The home of the United Nations Headquarters, New York is an important center for international diplomacy and has been described as the cultural capital of the world.</p>
    </div>

    <div>
      <h2>About</h2>
      <p>Located on one of the world's largest natural harbors, New York City consists of five boroughs, each of which is a county of New York State. The five boroughs—The Bronx, Brooklyn, Manhattan, Queens, and Staten Island—were consolidated into a single city in 1898. With a census-estimated 2012 population of 8,336,697 distributed over a land area of just 302.64 square miles, New York is the most densely populated major city in the United States. As many as 800 languages are spoken in New York, making it the most linguistically diverse city in the world. The New York Metropolitan Area's population is the United States’ largest, with 18.9 million people distributed over 6,720 square miles, and is also part of the most populous combined statistical area in the United States, containing 22.2 million people as of 2011.</p>
    </div>

    <div>
      <h2>History</h2>
      <p>New York traces its roots to its 1624 founding as a trading post by colonists of the Dutch Republic and was named New Amsterdam in 1626. The city and its surroundings came under English control in 1664 and were renamed New York after King Charles II of England granted the lands to his brother, the Duke of York. New York served as the capital of the United States from 1785 until 1790. It has been the country’s largest city since 1790. The Statue of Liberty greeted millions of immigrants as they came to America by ship in the late 19th and early 20th centuries and is a globally recognized symbol of the United States and its democracy.</p>
    </div>
  </section>

  <section id="population" class="container">
    <div>
      <h2>Population</h2>
      <table>
        <tr>
          <th>Borough</th>
          <th>Population</th>
          <th>Land Area</th>
        </tr>
        <tr class="darker">
          <td>Manhattan</td>
          <td>1,619,090</td>
          <td>23 sq. miles</td>
        </tr>
        <tr class="lighter">
          <td>Brooklyn</td>
          <td>2,565,635</td>
          <td>71 sq. miles</td>
        </tr>
        <tr class="darker">
          <td>Queens</td>
          <td>2,272,771</td>
          <td>109 sq. miles</td>
        </tr>
        <tr class="lighter">
          <td>The Bronx</td>
          <td>1,408,473</td>
          <td>42 sq. miles</td>
        </tr>
        <tr class="darker">
          <td>Staten Island</td>
          <td>470,728</td>
          <td>58 sq. miles</td>
        </tr>
      </table>
    </div>
  </section>
    
  <?php include "inc/footer.php"; ?>

  <?php include "inc/scripts.php"; ?>

</body>
</html>