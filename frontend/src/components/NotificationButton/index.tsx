import icon from '../../assets/img/notification-icon.svg';
import './styles.css';

function NotificationButton() {
  return (
    <div className="dsmeta-red-btn"> {/* Deve-se sempre utilizar o "className" ao invés do "class" pois o último é uma palavra chave do javascript */}
      <img src={icon} alt="Notificar" /> {/* Usa-se "{apelido}" para referenciar o import */}
    </div>
  );
}

export default NotificationButton;
