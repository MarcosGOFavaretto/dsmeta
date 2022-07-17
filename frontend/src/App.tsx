import Header from "./components/Header";
import SalesCard from "./components/SalesCard";

function App() {
  return (
    <>
      {" "}
      {/* Isso é um Fragment e serve para utilizar mais de um componente seguido do outro. */}
      <Header />
      <main>
        <section id="sales">
          <div className="dsmeta-container"></div>

          <SalesCard />
        </section>
      </main>
    </>
  );
}

export default App;
