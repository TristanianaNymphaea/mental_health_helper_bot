package org.oksanka;

public enum MessageResponseEnum {
    WELCOME_MESSAGE("/start", """
            Привіт! Я твій власний mental_health_helper_bot!
            І ти можеш до мене звертатися, коли потрібна допомога 
            у будь - який час. Якшо ти віддчуваєш занепокоєння, тривогу, 
            незрозумілі відчуття в своєму душевному стані чи піддався/піддалася стресовій ситуації, 
            то звертайся. Я знайду найкращий спосіб тобі допомогти і заспокоїти!
                 
            Спробуємо дізнатися, що тебе турбує. Щоб розпочати натисни /begin"""),
    BEGIN_MESSAGE("/begin",
            "Про що ти хочеш дізнатися більше? Вибери, будь ласка, із переліченого:"),

    MANIFESTATION_MESSAGE("/manifestations",
            """
                    Незначний стрес не є проблемою. Але дуже високий рівень стресу часто впливає і на тіло.
                    У багатьох людей виникають неприємні відчуття: 
                    головний біль, відсутність апетиту, біль у шиї та плечах, комок в горлі, біль в спині, важкість в грудях, розлади шлунку, напружені мʼязи, висипання на шкірі, інфекції хвороби
                    чи проблеми з кишечником.
                                        
                    Такі сильні почуття та думки властиві будь-якому стресу. 
                                        
                    Але якщо ми "зачепимося" за їх гачок, то можуть виникнути проблеми. Отже, ці важкі думки та почуття "чіпляють" нас на гачок і відтягують геть від наших ЦІННОСТЕЙ.
                    Цінності - це ваші найглибші бажання стосовно того, якою людиною ви хочете бути.
                                        
                    Існує багато різних важких думок і почуттів, які можуть нас зачепити: 
                    - думки про те, щоб махнути на все рукою (я здаюся! Все занадто важко!); 
                    - думки про те, щоб звинуватити інших (Він не повинен був цього робити. Це його провина!);
                    - різкі судження про себе (Я слабка людина. Мабуть, я ненормальна людина!); 
                    - спогади, особливо про важкі події; 
                    - думки про майбутнє, особливо про наші страхи щодо нього;
                    - тривожні думки про інших.
                                        
                    Або ми можемо замикатися в собі й відсторонюватися від тих, кого любимо. Або проводити багато часу лежачи у ліжку. Ми можемо вплутуватися в бійки, сваритися чи вступати в суперечки.
                                        
                    Щоб розібратися, як можна навчитися справлятися з цими симптомами, натисни, будь ласка, /practice
                    Щоб повернутися до menu натисни, будь ласка, /begin
                    """),
    PRACTICE_MESSAGE("/practice", """
            Що означає "бути включеними в життя? - 
            "Бути включеним" у щось - це означає приділяти цьому всю свою увагу.
                        
            Коли ви п'єте якийсь напій, чи приділяєте ви йому всю свою увагу?
            Чи насолоджуєтеся ви його запахом і смаком?                                                                                    
            Коли ви слухаєте музику, чи приділяєте ви їй всю свою увагу? 
            Чи слухаєте ви їі, отримуючи від неї задоволення?
                        
            Коли ви приділяєте всю свою увагу будь-якій діяльності, ми говоримо, що ви "включені" в цю діяльність. Але коли ви на гачку своїх думок і почуттів, ви - "не включені", "відсторонені".Коли ви приділяєте всю свою
            увагу будь-якій діяльності, ми говоримо, що ви "зосереджені. 
                        
            Є багато способів розвитку навичок включення у життя чи зосередження. 
                        
            Наприклад, коли ви п'єте чай або каву... зосередьте на цьому всю свою увагу. Ви з цікавістю розглядаєте напій, наче ніколи раніше його не бачили. Отримайте насолоду від його аромату. Зверніть увагу на колір. ПОВІЛЬНО зробіть перший ковток. Затримайте
            його на язиці, відчуйте як він торкається зубів і насолоджуйтеся його смаком. Ви просто приділяєте цій діяльності всю свою увагу.
                        
            Але інколи почуття та історії такі болючі. Так, іноді вони настільки сильні, що  перетворюються в "емоційні бурі".
                        
            Щоб розібратися, як можна навчитися справлятися з цими симптомами, натисни, будь ласка, /continue_practice
            Щоб повернутися до menu натисни, будь ласка, /begin
            """),

    CONTINUE_PRACTICE_MESSAGE("/continue_practice", """
                     "Емоційна буря" означає, що вас заполонили неймовірно важкі думки та почуття. Вони настільки потужні, що схожі на сильну бурю і можуть з легкістю подолати вас. 
                     
            Спершу ЗВЕРНІТЬ УВАГУ на те, як ви себе почуваєте і що ви думаєте.
            Потім УПОВІЛЬНІТЬСЯ і З'ЄДНАЙТЕСЯ зі своїм тілом. Сповільніть дихання. Повністю видихніть повітря з легень. Тоді якомога повільніше наповніть їх повітрям знову. Повільно притисніть свої ступні до підлоги.Повільно витягніть руки 
            вздовж тіла або так само повільно зімкніть долоні перед собою.Наступним кроком  у заземленні є ПЕРЕНАПРАВЛЕННЯ УВАГИ на світ навколо вас. Зверніть увагу на те, де ви знаходитесь. Які п'ять  предметів ви бачите?                                                        
            Які три-чотири звуки ви чуєте?  Вдихніть повітря. Який запах ви відчуваєте? Зверніть увагу на те, де ви знаходитеся і що ви робите. Доторкніться до коліна чи до поверхні на якій ви сидите, чи до будь-якого предмета, до якого можете дотягтися. Зверніть увагу на те, що ви відчуваєте під своїми пальцями.
                
            Так само звертайте увагу на те, як з'являються важкі думки та почуття. А, також, на світ навколо вас, світ, який ви можете бачити,чути,торкатися, смакувати і нюхати.
            Ви також можете рухати своїми руками, ногами і ротом, і, відповідно, при бажанні, ви можете діяти згідно з власними цінностями.
            Це не прожене ваші емоційні бурі. Воно лише збереже вас у безпеці, поки буря не вщухне.
            Деякі бурі тривають довго. Інші минають швидко.
                    
            Щоб розібратися, для чого ці практики, натисни, будь ласка, /goal_practice
                
            Щоб повернутися до menu натисни, будь ласка, /begin        
                    
            """),
    GOAL_PRACTICE_MESSAGE("/goal_practice", """
            Мета вправ  - допомогти вам "включитися" у життя. Наприклад, допомогти вам приділяти всю свою увагу родині та друзям.
            Вони також призначені допомогти вам рухатися назустріч вашим цінностям і поводитися так, як людина, якою ви б хотіли бути.
                        
            І допомогти вам зосередитися на тому, що ви робите, щоб ви могли робити це добре. Коли ви навчитеся концентруватися і повністю включатися в будь-яке заняття, ви також зможете отримувати від нього
            більше задоволення. Це працює навіть тоді, коли вам необхідно виконувати якісь монотонні дії, або роботу, яка дратує.
            Коли ми включаємось у життя, приділяємо увагу іншим, зосереджуємося на тому, що робимо, і живемо згідно з власними цінностями, ми набагато краще справляємося зі
            стресом.Це наче нарощування м'язів для того, щоб швидше бігати чи піднімати більшу вагу. Чим більше ви тренуєтесь, тим сильнішими стають ваші м'язи!
                        
            Пам'ятайте, навіть найменші дії мають значення.  Коли ви дієте згідно зі своїми цінностями, ви стаєте творцем власного насиченого життя, що приносить більше задоволення.                                                                               \s
                        
            Щоб дізнатися більще про боротьбу зі стресом та опанувати більше практик, перейдіть за посиданням:          
            World Health Organization Regional office for Europe                                           
            https://apps.who.int/iris/bitstream/handle/10665/339150/WHO-EURO-2021-361-40096-56774-ukr.pdf
                        
            Також, рекомендую за необхідністю звернутися до фахівця.
                        
            Щоб повернутися до menu натисни, будь ласка, /begin  
                
            """),
    BURN_OUT_MESSAGE("/syndrome", """
            Головні симптоми Burn Out Syndrome:
            - емоційне спустошення, мотиваційне виснажання;
            - розумове виснажання;
            - фізична втома;
            - особистісне відсторонення;
            - "автоматичне" виконання роботи;
            - байдужість та цинізм;
            - недооцінка власлих професійних досягнень;
            - ослабдкння відчуття задоволення від роботи;
            - порушення взаємостосунків з колегами та в сім’ї ;
            - погіршення якості життя та негативне ставлення до себе; 
            - розлади фізичного та психічного здоров’я.
                        
            Якщо хочеш відповісти на більше запитань, які можуть допомогти у визначенні вигорання, 
            натисни, будь ласка, /burn_out_questions
                        
            Щоб повернутися до menu натисни, будь ласка, /begin  
                        
            """),
    BURN_OUT_SYNDROME_MESSAGE("/burn_out_questions", """
            Ось кілька питань, які можуть допомогти у визначенні вигорання:
                        
            - Важко зосередитися?
            - Чи з’явилося безсоння?
            - Результати не задовольняють?
            - Чи з’явилося цинічне відношення?
            - Треба себе змушувати щось робити?
            - Постійно енергія на нулі, відчуття непродуктивності?
            - Втішаєшся їжею, алкоголем, наркотиками?
            - Тебе дратують клієнти, колеги, люди поруч?
            - Болить голова, нудить, з’явилися нові проблеми зі здоров’ям?
            - Порушилася харчова поведінка, тобто або переїдання або втрата апетиту?
                        
                        
            Щоб дізнатися більше натисни, будь ласка, /about
                        
            Щоб повернутися до menu натисни, будь ласка, /begin  
                        
            """),
    ABOUT_BURN_OUT_SYNDROME_MESSAGE("/about", """
            Особливо схильними до вигорання на роботі є люди, які працюють в сфері «людина- людина», тобто ті, чия робота пов’язана з постійниим спілкуванням. Це лікарі, педагоги, психологи, соціальні працівники, волонтери, менеджери, керівники різних сфер та інші. Необхідність постійно бути на зв’язку, вислуховувати інших і говорити самому, стежити за важливими новинами, давати вказівки підлеглим або навпаки виконувати доручення керівництва, намагатися виправдати чиїсь очікування, перевершити конкурентів, продемонструвати хороші показники — все це призводить до того, що в якийсь момент у людини просто «сідають батарейки».
            Чим емоцйійне вигорання відрізняється від перевтоми?
                                
            Коли ти просто втомився/втомилася, то можеш привести себе в норму за кілька днів. Досить просто виспатися, провести вихідні з вимкненим телефоном, щоб відпочити від постійних дзвінків, переключитися на хорошу книгу, сходити в спортзал або прийняти гарячу ванну, і ось, ви знову сповнені сил і енергії.
                                
            Якщо у тебе емоційне вигорання, його не позбутися просто так. Більш того, з часом все тільки погіршується. Нервове напруження і стреси призводять до погіршення сну, підвищена дратівливість провокує конфліктні ситуації на роботі, негаразди в професійній сфері відбиваються на сім’ї та особистих стосунках.
                        
            Щоб дізнатися як уникнути емоційного вигорання, натисни, будь ласка, /prevention
                    
            Щоб повернутися до menu натисни, будь ласка, /begin              
                    """),

    PREVENTION_BURN_OUT_SYNDROME_MESSAGE("/prevention", """
            Як уникнути вигорання?
                    
            - Намагатися розраховувати і обдумано розподіляти свої навантаження
            - Вчитися переключатися з одного виду діяльності на інший
            - Простіше ставитися до конфліктів на роботі
            - Не намагатися завжди і в усьому бути кращим/кращою  
            - Знайти місце зупинки роботи (ефект «тумблера»)
            - Працювати над подоланням стереотипів в роботі
            - Пам'ятати про різні види психотерапії та використовувати їх
            - Використовувати різні види психотерапії
            - Зайнятися іншою (паралельною) діяльністю
            - Балінтовські групи
            - Неформальні відносини на роботі
            - Турбуватися про когось за межами роботи
            - Ніколи не страждати поодинці - поговорити з тим, кому довіряєте
            - Прийняти теплий душ, розслабитися і дати волю сльозам
            - Ретельно проаналізувати ситуацію    
            - Думати про майбутнє і обов'язково планувати до деталей
            - Тренуватися «Думати про їжу, коли їсте, і про чашку, коли її миєте»
            - Робота - щоденний елізод життя, В чому суть життя для Вас?
            - Розуміти, що твоя робота має позитивні і негативні сторони
            - Аналізувати чого ти досягнув/досягнула і якими зусиллями
            - Вести щоденник, фіксувати найбільші враження та свою допомогу комусь!
                        
            Щоб дізнатися як подолати емоційного вигорання, натисни, будь ласка, /overcoming
                    
            Щоб повернутися до menu натисни, будь ласка, /begin       
                        
                    """),

    OVERCOMING_BURN_OUT_SYNDROME_MESSAGE("/overcoming", """
            Як подолати емоційного вигорання?   
              
            - Товаришуй, спілкуйтеся із тими, хто радіє життю
            - Проводьдь з батьками більше часу - момент, коли їх не стане, завжди настає неочікувано
            - Ввічливість завойовує міста. Користуйся цим частіше
            - Не дивися телевізор. Ніколи
            - Відмовся від звички постійно скаржитися. Нікого не цікавлять чужі проблеми
            - У незрозумілих ситуаціях завжди лягай спати. Також в будь-яких ситуаціях пам'ятай, що «і це пройде»
            - Навіть в серйозній сварці не намагайся зачепити людину за живе. Ви помиритеся (скоріш за все), а слова запам'ятаються надовго
            - Не повертайся до людей, які тебе зрадили. Вони не міняються
            - Не смійтеся над чужими мріями
            - Є такий вираз: «Рухатися далі». Спробуй, допомагає
            - На початку дня роби всі самі важкі та неприємні справи
            - Частіше гладь собаку чи кота. Перевірено - допомагає
            - Пам'ятай: ніхто нікому нічого не винен. Забудь слово «винен», «повинен»
            
            Ти можеш переглянути відео чудового фахівця за посиланням https://youtu.be/EORBcoDf4Vo
            
            Також, рекомендую за необхідністю звернутися до фахівця.
                        
            Щоб повернутися до menu натисни, будь ласка, /begin  
                
            """),

    ANXIETY_MESSAGE("/anxiety", """
            Фізіологічні ознаки тривожного розладу
                        
            - Головний біль
            - Біль у грудях
            - "Нервова" діярея
            - Підвищений тиск
            - Прискорене серцебиття
            - Відчуття нестачі повітря
            - Підвищене потовиділення
            - Тремор
            - Тонус м'язів
                        
            Психологічні симптоми тривожного розладу
                        
            - Втомлюваність
            = Підвищена лякливість
            - Порушення сну
            - Підвищена залученість до хобі
            - Втрата інтересу до життя
            - Почуття самотності
            - Забудькуватість
            - Почуття злості
                        
            Щоб дізнатися більше, натисни, будь ласка, /testing
                    
            Щоб повернутися до menu натисни, будь ласка, /begin               
                
            """),
    TESTING_ANXIETY_MESSAGE("/testing", """
    Пропоную, щоб визначити рівень твоєї тривожності пройди тестування за посиланням 
    https://www.samopomi.ch/get-tested/test-dlja-skriningu-trivozhnosti-gad-7
    
    Щоб дізнатися як подолати тривогу, натисни, будь ласка, /coping
                    
    Щоб повернутися до menu натисни, будь ласка, /begin  
    """),
    HELPING_ANXIETY_MESSAGE("/coping", """
    Як впоратися з тривогою?
                        
    Ситуативна тривога про минуле або майбутнє мине, якщо усвідомлено перемкнути увагу на те, як почувається тіло зараз. Ідеально працюють дихальні практики: зробити 10—20 повільних глибоких вдихів, вдихаючи якомога глибше, затримуючи повітря на кілька секунд, і повільно видихаючи.
    Крім дихання, повернутися в «тут і зараз» допомагають відчуття в тілі від усіх органів почуттів за схемою 5-4-3-2-1:
                        
    Зір. Знайти 5 гарних предметів, які привертають погляд: наприклад, небо, квітка на підвіконні, каблучка на руці.
            
    Дотик. Знайти 4 речі, до яких приємно доторкнутися: гаряча чашка, м’який шарф.
            
    Слух. Звернути увагу на 3 звуки, які чути просто зараз (дихання, звук принтера, сміх у сусідньому офісі).
            
    Нюх. Вдихнути два яскраві аромати. Можна відчинити вікно і впустити свіже повітря або відчути, як пахнуть улюблені парфуми.
            
    Смак. Спробувати щось з вираженим смаком — лимон, ложку меду, листочок м’яти.
            
    Щоб дізнатися як ще можна подолати тривогу, натисни, будь ласка, /helping
                    
    Щоб повернутися до menu натисни, будь ласка, /begin  
            
    """),

    OTHER_HELPING_ANXIETY_MESSAGE("/helping", """
    Довгострокові стратегії, щоб запобігти тривалому стану тривоги
                        
    Дозувати доступ до стресової інформації. Важливо бути в курсі ситуації, але чи потрібен нервовій системі постійний потік новин? Абсолютно точно — ні. Краще передбачити пів години на день для новин і читати фактичну інформацію з надійних джерел, яка допомагає краще зрозуміти ситуацію або розв’язати проблему. І відмовитися від ресурсів із сенсаційною, драматичною інформацією, що провокує емоційне залучення і велику тривожність.
                        
    Зосередитися на справах, які можна контролювати. Чому від фільму-катастрофи неможливо відірватися? Тривога й хвилювання так захоплюють увагу й розбурхують нервову систему, що хочеться ще. Між нейронами щодня формуються нові зв’язки, і дозволяючи собі постійно непокоїтися через щось нерозв’язне, наприклад, глобальні проблеми людства, можна порівняно легко навчити свій мозок тривожності як нової моделі поведінки й увести тривогу в щоденну звичку. Набагато конструктивніше замінити хвилювання на реальні кроки на своєму рівні. 
    Стати донором крові, сортувати сміття, брати участь у соціальних проєктах, написати книжку — це конкретні дії, які дають змогу мозкові залишитися на максимальному рівні психологічного благополуччя 
    і трохи наблизитися до розв’язання глобальних проблем людства.
    
    Робити вибір на користь власного комфорту й щастя. У періоди стресу для нервової системи й для всього тіла як ніколи потрібні базові речі — добре харчуватися, займатися спортом, висиплятися і знаходити час для відпочинку. Важливо наповнювати день тим, що додає спокою в житті та стимулює вироблення серотоніну, окситоцину, дофаміну та ендорфінів — «гормонів щастя»: приємні ритуали, звичні плани на день, безліч цінних моментів з близькими, обійми, поцілунки, слова підтримки, час проведений разом. Гормони щастя усувають негативні наслідки стресу й тривоги на організм та підтримують фізичне й психологічне благополуччя.        
    
    Щоб дізнатися які ліки можна симптоматично приймати при тривозі, натисни, будь ласка, /medicine
                    
    Щоб повернутися до menu натисни, будь ласка, /begin        
            
    """),

    MEDICINE_HELPING_ANXIETY_MESSAGE("/medicine", """
    
    Симптоматично  при тривозі можна прийняти:
    магне В6 по 1 таб. 3 рази на день протягом кількох тижнів;
    адаптол 300 мг по 1 таб. 3 рази на день протягом кількох днів чи кількох тижнів;
    чи
    спітомін 5 мг по 1 таб. 2 - 3 рази на день протягом кількох днів чи кількох тижнів;
    Проте слід розуміти, що це тільки симптоматична терапія. І проблему потрібно вирішувати глибше, тому зверніться до фахівця.
    
    Щоб повернутися до menu натисни, будь ласка, /begin 
    """),
    DEPRESSION_MESSAGE("/depression", """
    Існує стійка думка, що люди, які знаходяться в цьому стані, перебувають у сумному настрої, не спілкуються і їх легко помітити. Насправді це не завжди так.
                        
    Людина може повністю перестати отримувати задоволення від речей, які її радували, втратити або відчувати посилений апетит, сильну слабкість і сонливість.
                        
    Ви не завжди можете пов’язати фізичний стан з психологічним, приписуючи втому великому обсягу роботи.
                        
    Одними з перших ознак можуть бути дратівливість навіть від повсякденних речей, безсоння, складнощі з концентрацією уваги, болі або висипання на шкірі, постійні нав’язливі думки про погане, тривожність.
                        
    Депресія не завжди сприймається як захворювання не тільки близькими хворого, але і їм самим. Поганий настрій тримається тижнями, все бачиться в похмурих фарбах, не хочеться рухатися, а хочеться забитися в кут та просто лежати. Хворого звинувачують у погіршенні характеру, в егоїзмі й ліні. 
    А йому потрібна допомога. Допомога фахівця.
             
    Щоб більще дізнатися про види депресії натисни, будь ласка, /species
            
    Щоб повернутися до menu натисни, будь ласка, /begin             
    """),

    SPECIES_DEPRESSION_MESSAGE("/species", """
    - Депресивний епізод
                        
    Це найпоширеніша форма захворювання. Її тривалість від двох тижнів до року. Якщо такий розлад фіксується тільки один раз, його називають однополярним. Приблизно 33% пацієнтів тільки один раз в житті стикаються з цим станом. Як правило, депресивний розлад супроводжується зниженням працездатності. Відсутність лікування може призвести до рецидиву.
                   
    - Періодичний депресивний розлад (рекурентний депресивний розлад)
                        
    Характеризується повторенням епізодів. Називається ще рекурентним, а також класичною або клінічною депресією. Зазвичай, вперше фіксується в дитячому або підлітковому віці. Тривалість від кількох місяців до кількох років. Фази захворювання чергуються з ремісією. Серйозно впливає на працездатність та вимагає звернення до дитячого психолога на ранніх стадіях розвитку захворювання.
                   
    - Дистимія
                        
    Тривалість від двох років до десятиліть. Хоча симптоми менш виражені, ніж при рекурентному розладі, вони тривають довше. Дистимію називають також хронічною депресією. Перехід цього типу в важку форму іменується подвійною депресією.
                    
    - Біполярна депресія I-го типу
                        
    Характеризується зміною фаз захворювання, ремісії й маніакальних фаз. Цей розлад також має назву маніакально-депресивний психоз. Коли хворий переживає останню фазу, він відрізняється гіперактивністю в поєднанні з хорошим настроєм, але водночас з занепокоєнням й безсонням. Хворий втрачає здатність критично мислити. Як результат — проблеми з фінансами, ризик випадкових статевих зв'язків. Після цієї фази хворий впадає в депресію. Це біполярні розлади.
                    
    - Біполярна депресія II-го типу
                        
    Схожа на депресивні епізоди. Теж спостерігаються зміни фаз, але без надмірного підвищення настрою. Під час ремісії виникає ілюзія одужання.
                    
    - Депресивний психотичний епізод
                        
    При цьому розладі спостерігаються галюцинації, марення. Такі хворі в більшості випадків вимагають госпіталізації.
                    
    - Атипова депресія
                        
    Легкий тип депресії, що супроводжується сонливістю й надмірністю в їжі, різкою зміною настрою, підвищеною чутливістю, схильністю до панічних атак.
         
    - Сезонні депресивні розлади
                        
    Відзначаються найчастіше восени або взимку. При зміні сезону проходять.
    
    Щоб пройти тестування та визначити ймовірність у тебе депресивного роздаду, натисни, будь ласка, /depression_testing
               
                    
    Щоб повернутися до menu натисни, будь ласка, /begin 
                
    """),

    TESTING_DEPRESSION_MESSAGE("/depression_testing", """
    Щоб визначити ймовірність у тебе депресивного роздаду за посиланням https://cbt-therapist.net/PHQ-9
    
    Також, рекомендую пройти тестування для визначуння рівня тривожності за посиланням 
    https://www.samopomi.ch/get-tested/test-dlja-skriningu-trivozhnosti-gad-7
    
    Щоб дізнатися рекомендації, натисни, будь ласка, /recommendation
    
    Щоб повернутися до menu натисни, будь ласка, /begin 
    
    """),
    RECOMMENDATION_DEPRESSION_MESSAGE("/recommendation", """
    Якщо в результаті тестування, виявилося, що ймовірно у тебе може бути депресивний чи тривожний роздад, 
    звернися до фахівця, щоб якнайшвидше отримати потрібну допомогу та насолоджуватися життям.
    
    
    Щоб дізнатися можливі методи запобігання депресії, натисни, будь ласка, /prevention_depression
    
    Щоб повернутися до menu натисни, будь ласка, /begin 
    
    """),
    PREVENTION_DEPRESSION_MESSAGE("/prevention_depression", """
                
    ПРОФІЛАКТИКА ДЕПРЕСІЇ
                        
    - Восьмигодинний нічний сон. Відновлення функціонування всіх органів і систем в організмі можливе лише за наявності повноцінного якісного сну.
    - Правильне харчування. Правильне збалансоване харчування, прийом їжі в один і той же час, відсутність звички переїдати, і їсти перед сном, допоможуть зберегти психічне здоров’я і емоційну стабільність.
    - Відмовся від шкідливих звичок – вживання алкоголю, наркотичних засобів, позначається на роботі всіх систем і органів та посилюють депресію.
    - Проводь дозвілля в оточенні рідних і близьких. Близькі люди допомагають людині підвищити самооцінку, відчути себе потрібною – а це найкраща профілактика депресії.
    - Не соромся просити про допомогу. Попросити когось про допомогу, це не прояв слабкості. Колеги, близькі, рідні, друзі із задоволенням візьмуть частину турбот на себе, це не тільки допоможе вам знизити психо-емоційне і фізичне навантаження, але й налагодити більш теплі стосунки з оточуючими.
    - Приділяй більше уваги руховій активності. Тренування, прогулянка перед сном або пару зупинок пішки до роботи  – все це може допомогти забути про проблеми, відволіктися від турбот, впоратися зі стресом.
    - Намагайся уникати стресових ситуацій. Ставте цілі, які цілком реально досягти і радійте кожній маленькій перемозі. Уникайте спілкування з людьми, які люблять посперечатися і конфліктувати.
    - Приділяй більше часу собі. Читання книг, тепла ванна, похід по магазинах, зустрічі з друзями  – все те, що приносить вам задоволення, що допомагає викликати позитивні емоції.
      
      
      Також, можете переглянути відео:
      https://youtu.be/-11JhGsrKXo
      https://youtu.be/KnA98F0Iojw  
      https://youtu.be/tEs3gDtLXc4
      https://youtu.be/75iNWM_DT5U
      https://youtu.be/EjgehqXrrvY
      https://youtu.be/QiPBV12zL0k
      https://youtu.be/NNO4pq3pbZ8
      https://youtu.be/KBE_OPdi4bM
      https://youtu.be/t_yGbSy9HVg
      
      
    Щоб повернутися до menu натисни, будь ласка, /begin      
     """),

    DEFAULT_MESSAGE(null, "Привіт! Натисни, будь ласка, /start, щоб розпочати спілкування.");
    private final String key;
    private final String message;

    MessageResponseEnum(String key, String message) {
        this.key = key;
        this.message = message;
    }

    public String getKey() {
        return key;
    }

    public String getMessage() {
        return message;
    }

}
