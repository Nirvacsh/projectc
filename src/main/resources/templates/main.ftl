<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>
<@c.page>

<#--    <form action="${main}" method="post">-->
    <form action="/main" method="post">
        <input type="text" name="docNumber" placeholder="Номер документа"/>
        <input type="date" name="docDate" placeholder="Дата подписания" />
        <input type="text" name="fopFio" placeholder="ФОП ФИО"/>
        <input type="text" name="fopNumber" placeholder="ФОП номер в реестре"/>
        <input type="date" name="fopDate" placeholder="ФОП дата в реестре"/>
        <input type="text" name="docWorks" placeholder="Тип работ"/>
        <input type="text" name="docService" placeholder="Работы" />
        <input type="number" name="docMoney" placeholder="Деньги в цифрах" />
        <input type="text" name="docMoneyUa" placeholder="Деньги буквами"/>
        <input type="text" name="fopPassport" placeholder="ФОП пасспорт"/>
        <input type="number" name="fopPassportNumber" placeholder="ФОП номер пасспорта"/>
        <input type="text" name="fopAddress" placeholder="ФОП адресс" />
        <input type="text" name="fopMoneyNumber" placeholder="ФОП номер в банке"/>
        <input type="text" name="fopTelephone" placeholder="ФОП телефон"/>
        <input type="text" name="fopCode" placeholder="ФОП идент код" />
        <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        <input type="submit" value="Submit"/>
    </form>
<@l.logout></@l.logout>
</@c.page>