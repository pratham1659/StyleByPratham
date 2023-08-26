import React from "react";

const HomeSectionCard = () => {
  return (
    <div className="cursor-pointer flex flex-col items-center bg-white rounded-lg shadow-lg overflow-hidden w-[15rem] mx-3 border border-black">
      <div className="h-[13rem] w-[10rem]">
        <img
          className="object-cover object-top w-full h-full"
          src="https://sslimages.shoppersstop.com/sys-master/images/h90/h16/28890809171998/S23LCSOCOTFS83A_NAVY.jpg_230Wx334H"
          alt=""
        />
      </div>
      <div className="p-4">
        <h3 className="text-lg font-medium text-gray-900">Life</h3>
        <p className="mt-2 text-sm text-gray-500">
          Solid Cotton Slim Fit Mens Shirt
        </p>
      </div>
    </div>
  );
};

export default HomeSectionCard;
