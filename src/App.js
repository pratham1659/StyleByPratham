import "./App.css";
import Footer from "./customer/components/Footer/Footer";
import MainNavigation from "./customer/components/Navigation/MainNavigation";
import Products from "./customer/components/Product/Products";
// import HomePage from "./customer/pages/homePage/HomePage";

function App() {
  return (
    <div className="">
      <MainNavigation />
      <div>
        {/* <HomePage /> */}
        <Products />
      </div>
      <div>
        <Footer />
      </div>
    </div>
  );
}

export default App;
