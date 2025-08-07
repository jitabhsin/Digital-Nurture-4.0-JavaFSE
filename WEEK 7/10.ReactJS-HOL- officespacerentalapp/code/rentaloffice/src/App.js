import React from 'react';
import './App.css';

function App() {
  const heading = "Office Space Rentals";
  const imgSrc = "https://images.pexels.com/photos/3184465/pexels-photo-3184465.jpeg";

  const officeList = [
    { Name: "DBS", Rent: 50000, Address: "Chennai" },
    { Name: "freshly", Rent: 75000, Address: "Bangalore" },
    { Name: "smartly works", Rent: 60000, Address: "Hyderabad" },
    { Name: "topex", Rent: 85000, Address: "Mumbai" }
  ];

  return (
    <div className="App">
      <h1>{heading}, at Affordable Range</h1>
      <img src={imgSrc} width="25%" height="25%" alt="Office Space" />

      {officeList.map((x, i) => {
        let c = x.Rent <= 60000 ? "textRed" : "textGreen";
        return (
          <div key={i} className="card">
            <h2>Name: {x.Name}</h2>
            <h3 className={c}>Rent: Rs. {x.Rent}</h3>
            <h3>Address: {x.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;
