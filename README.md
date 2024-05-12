# NCooldowns README

Welcome to the NCooldowns plugin README! NCooldowns is designed for Minecraft servers, specifically for version 1.16.5. It focuses on enhancing server moderation by restricting chat access for new players and managing command usage more securely.

## Table of Contents 📃

- [Description](#description)
- [Written On](#written-on)
- [Screenshots](#screenshots)
- [Installation](#installation)
- [Features](#features)
- [Commands and Permissions](#commands-and-permissions)
- [Contacts](#contacts)

## Description 💙

NCooldowns is a robust plugin tailored to improve the control over chat functionalities on Minecraft servers. It prevents spam effectively by setting initial chat restrictions for newcomers and blocks specific commands like those using colons (e.g., `minecraft:me`). The plugin offers comprehensive customization options, from notification styles and sound types to detailed message configurations using Minecraft color codes. A special placeholder, `%time%`, is included to inform users about their remaining wait time before they can chat.

![Line](https://github.com/n1zamu/n1zamu/blob/main/assets/sepparator.png)

NCooldowns - это надежный плагин, предназначенный для улучшения контроля над функциями чата на серверах Minecraft. Он эффективно предотвращает спам, устанавливая начальные ограничения в чате для новичков, и блокирует специфические команды, например, использующие двоеточия (например, `minecraft:me`). Плагин предлагает широкие возможности настройки, от стилей уведомлений и типов звуков до детальной конфигурации сообщений с использованием цветовых кодов Minecraft. Для информирования пользователей об оставшемся времени ожидания, прежде чем они смогут написать в чат, в плагин включен специальный заполнитель `%time%`.


## Written on 👩‍💻
![Java](https://img.shields.io/badge/-Java-FFA500?style=for-the-badge&logo=java&logoColor=0000CD)
![Bukkit](https://img.shields.io/badge/-Bukkit-7B68EE?style=for-the-badge)

## Screenshots 📸
![Example](https://github.com/n1zamu/NCooldown/blob/main/screenshots/example.png)
![Example](https://github.com/n1zamu/NCooldown/blob/main/screenshots/example1.png)
![Example](https://github.com/n1zamu/NCooldown/blob/main/screenshots/example2.png)

### Installation 🌙
Latest version - https://github.com/n1zamu/NCooldown/releases/

Download the latest version and place it in the PLUGINS DIR on your server.
It will create a nCooldowns folder in the plugins folder, where there will be a database.db file containing player databases and a config.yml file for flexible plugin customization.

![Line](https://github.com/n1zamu/n1zamu/blob/main/assets/sepparator.png)

Последняя версия - https://github.com/n1zamu/NCooldown/releases/

Скачайте последнюю версию и поместите ее в PLUGINS DIR на вашем сервере.
Он создаст папку nCooldowns в папке plugins, где будет находиться файл database.db, содержащий базы данных игроков, и файл config.yml для гибкой настройки плагина.

## Features 🌟

- **Cooldown Management:** Enforce custom cooldown periods for chat and command usage to prevent spam and maintain server health.
- **Color Code Support:** Customize messages with Minecraft's color codes to make alerts and notifications stand out.
- **Sound Notifications:** Optional sound notifications to alert players when cooldowns expire or commands are available.
- **Multilanguage Support:** Messages can be configured in both English and Russian.

## Permissions 🔑

- `nCooldowns.bypass`: Allows bypassing chat cooldowns.
- `nCooldowns.reload`: Permits reloading the plugin's database.

## Placeholders

- `%time%`: Displays the remaining time before a player can use chat again.

## Configuration Options ⚙️

- **cooldown**: `600` - Sets the initial cooldown for new players (in seconds).
- **doubleDotCommands**: `true` - Disables commands containing colons, such as `minecraft:me`.
- **notification**: Activate to notify players about the remaining cooldown time.
- **sound**: `true` - Enable to use sound notifications.
- **soundType**: `"ENTITY_EXPERIENCE_ORB_PICKUP"` - Sets the type of sound for notifications.
- **message**: `true` - Send cooldown notifications as chat messages.
- **title**: `false` - Display notifications as full-screen messages.

## Messages 📝

- **noPermission**: "&fYou don't have permission to reload cooldowns"
- **unknownUsage**: "&fUse: /ncooldowns reload"
- **successfullyReload**: "&nCooldowns successfully reloaded!"
- **joinMessage**: "&fYou are new to the server! Play &6%time% to write in chat!"
- **blockMessage**: "&fYou haven't played the time yet! Wait &6%time%!"
- **notEnoughArgumentsMessage**: "&fNot enough arguments!"
- **doubleDotMessage**: "&fColon commands are forbidden!"

![Line](https://github.com/n1zamu/n1zamu/blob/main/assets/sepparator.png)

## Возможности 🌟

- **Управление Кулдаунами**: Применение индивидуальных периодов ожидания для чата и использования команд для предотвращения спама и поддержания здоровья сервера.
- **Поддержка Цветовых Кодов**: Настройка сообщений с использованием цветовых кодов Minecraft для выделения уведомлений и оповещений.
- **Звуковые Уведомления**: Опциональные звуковые уведомления для оповещения игроков о окончании кулдаунов или доступности команд.
- **Мультиязычная Поддержка**: Сообщения могут быть настроены на английском и русском языках.

## Разрешения 🔑

- `nCooldowns.bypass`: Позволяет обходить кулдауны чата.
- `nCooldowns.reload`: Разрешает перезагрузку базы данных плагина.

## Плейсхолдеры

- `%time%`: Отображает оставшееся время до того, как игрок сможет снова использовать чат.

## Опции Конфигурации ⚙️

- **cooldown**: `600` - Устанавливает начальный кулдаун для новых игроков (в секундах).
- **doubleDotCommands**: `true` - Отключает команды, содержащие двоеточия, например, `minecraft:me`.
- **notification**: Активировать для уведомления игроков о оставшемся времени кулдауна.
- **sound**: `true` - Включить звуковые уведомления.
- **soundType**: `"ENTITY_EXPERIENCE_ORB_PICKUP"` - Устанавливает тип звука для уведомлений.
- **message**: `true` - Отправлять уведомления о кулдаунах в виде сообщений в чат.
- **title**: `false` - Отображать уведомления в виде сообщений на весь экран.

## Сообщения 📝

- **noPermission**: "&fУ вас нет прав для перезагрузки кулдаунов"
- **unknownUsage**: "&fИспользование: /ncooldowns reload"
- **successfullyReload**: "&cКулдауны успешно перезагружены!"
- **joinMessage**: "&fТы новичок на сервере! Отыграй &6%time% чтобы писать в чат!"
- **blockMessage**: "&fТы еще не отыграл время! Подожди &6%time%!"
- **notEnoughArgumentsMessage**: "&fНедостаточно аргументов!"
- **doubleDotMessage**: "&fКоманды через двоеточие запрещены!"

## Contacts 🔊

### My Discord Tag: n1zamu
![Discord](https://img.shields.io/badge/-Discord-4169E1?style=for-the-badge&logo=discord&logoColor=FFFFFF)


# ⭐Leave star on this project if you like this!
