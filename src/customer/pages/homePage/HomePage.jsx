import React from "react";
import MainCarosel from "../../components/HomeCarosel/MainCarosel";
import HomeSectionCarosel from "../../components/HomeSection/HomeSectionCarosel";

const HomePage = () => {
  return (
    <div>
      <MainCarosel />
      <div>
        <HomeSectionCarosel />
      </div>
    </div>
  );
};

export default HomePage;
