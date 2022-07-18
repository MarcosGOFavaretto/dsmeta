import axios from "axios";
import icon from "../../assets/img/notification-icon.svg";
import { BASE_URL } from "../../utils/request";
import "./styles.css";

type Props = {
  saleId: number;
};

function handleClick(id: number) {
  axios(`${BASE_URL}/sales/${id}/notification`).then((response) => {
    console.log("SUCESSO");
  });
}

function NotificationButton({ saleId }: Props) {
  return (
    <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
      {" "}
      {/* Deve-se sempre utilizar o "className" ao invés do "class" pois o último é uma palavra chave do javascript */}
      <img src={icon} alt="Notificar" />{" "}
      {/* Usa-se "{apelido}" para referenciar o import */}
    </div>
  );
}

export default NotificationButton;
