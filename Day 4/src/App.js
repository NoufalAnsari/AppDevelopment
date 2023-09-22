import "./App.css";
import NavBar from "./components/NavBar";
import { BrowserRouter as Router,  Route, Routes } from "react-router-dom";
import { Home } from "./components/Pages/Home";
import { About } from "./components/Pages/About";
import { Blog } from "./components/Pages/Blog";
import { Contact } from "./components/Pages/Contact";
import { Login } from "./components/Pages/Login";

function App() {
  return (
    <>
      <Router>
        <NavBar />
        <div className="pages">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/about" element={<About />} />
            <Route path="/blog" element={<Blog />} />
            <Route path="/contact" element={<Contact />} />
            <Route path="/login" element={<Login />} />
          </Routes>
        </div>
      </Router>
      <div className="footer">
      <div className="footer-content">
        <div className="footer-section">
          <h3>Address</h3>
          <p>123 Main Street City, State<br />Postal Code</p>
        </div>
        <div className="footer-section">
          <h3>Social Media</h3>
        </div>
        <div className="footer-section">
          <h3>Contact Info</h3>
          <p>Email: example@example.com<br />Phone: +1 (123) 456-7890</p>
        </div>
      </div>
      </div>
  </>
  );
}

export default App;

