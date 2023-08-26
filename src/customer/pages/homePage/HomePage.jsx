import React from "react";
import MainCarosel from "../../components/HomeCarosel/MainCarosel";
import HomeSectionCarosel from "../../components/HomeSection/HomeSectionCarosel";

const HomePage = () => {
  return (
    <div>
      <MainCarosel />
      <div className="space-y-1 py-20">
        <HomeSectionCarosel />
        <HomeSectionCarosel />
        <HomeSectionCarosel />
        <HomeSectionCarosel />
        <HomeSectionCarosel />
        <HomeSectionCarosel />
      </div>
    </div>
  );
};

export default HomePage;
