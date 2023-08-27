import React from "react";

const ProductCard = () => {
  return (
    <div className="productCard w-[15rem] m-3 transition-all cursor-pointer">
      <div className="h-[20rem]">
        <img
          className="h-full w-full object-cover"
          src="https://sslimages.shoppersstop.com/sys-master/images/hcf/h00/28966891651102/A22MSH1185_BLUE.jpg_230Wx334H"
          alt="MensShirts"
        />
      </div>
    </div>
  );
};

export default ProductCard;
