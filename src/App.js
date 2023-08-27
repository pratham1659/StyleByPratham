import "./App.css";
import Footer from "./customer/components/Footer/Footer";
import MainNavigation from "./customer/components/Navigation/MainNavigation";
import HomePage from "./customer/pages/homePage/HomePage";

function App() {
  return (
    <div className="App">
      <MainNavigation />
      <div>
        <HomePage />
      </div>
      <div>
        <Footer />
      </div>
    </div>
  );
}

export default App;
