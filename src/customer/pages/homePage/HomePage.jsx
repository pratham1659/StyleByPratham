import React from "react";
import MainCarosel from "../../components/HomeCarosel/MainCarosel";
import HomeSectionCarosel from "../../components/HomeSection/HomeSectionCarosel";
import { mens_clothing } from "../../../Data/mens_clothing";

const HomePage = () => {
  return (
    <div>
      <MainCarosel />
      <div className="space-y-10 py-20 flex flex-col justify-center px-5 lg:px-10">
        <HomeSectionCarosel
          data={mens_clothing}
          sectionName={"Men's TopWear"}
        />
        <HomeSectionCarosel
          data={mens_clothing}
          sectionName={"Men's BottomWear"}
        />
        <HomeSectionCarosel
          data={mens_clothing}
          sectionName={"Mens CasualWear"}
        />
        <HomeSectionCarosel
          data={mens_clothing}
          sectionName={"Men's Traditional Collection"}
        />
        <HomeSectionCarosel
          data={mens_clothing}
          sectionName={"Men's FootWear"}
        />
        <HomeSectionCarosel
          data={mens_clothing}
          sectionName={"Mens Winter Collections"}
        />
      </div>
    </div>
  );
};

export default HomePage;
