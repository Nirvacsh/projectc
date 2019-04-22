<#import "parts/common.ftl" as c>
<@c.page>
<p class="h1 text-primary">Форма заповнення полів документа</p>
<br>
<#--<form action="/main" method="post" role="form" class="form-horizontal">-->
<#--    <div class="form-row">-->
<#--        <div class="form-group col-md-6">-->
<#--            <label class="control-label" for="docNumberId">Номер документа</label>-->
<#--            <input type="text" name="docNumber" id="docNumberId" class="form-control" placeholder="Номер документа"/>-->
<#--        </div>-->
<#--        <div class="form-group col-md-6">-->
<#--            <label class="control-label" for="docDateId">Дата підписання</label>-->
<#--            <input type="date" name="docDate" id="docDateId" class="form-control" placeholder="Дата подписания" />-->
<#--        </div>-->
<#--        <div class="form-group col-md-6">-->
<#--            <label for="fopFioId" class="control-label">ФОП ПІБ</label>-->
<#--            <input type="text" name="fopFio" id="fopFioId" class="form-control" placeholder="ФОП ФИО"/>-->
<#--        </div>-->
<#--        <div class="form-group col-md-6">-->
<#--            <label class="control-label" for="fopNumberId">Номер ФОП в реєстрі</label>-->
<#--            <input type="text" name="fopNumber" id="fopNumberId" class="form-control" placeholder="ФОП номер в реестре"/>-->
<#--        </div>-->
<#--        <div class="form-group col-md-6">-->
<#--            <label class="control-label" for="fopDateId">Дата додавання ФОП в реєстр</label>-->
<#--            <input type="date" name="fopDate" id="fopDateId" class="form-control" placeholder="ФОП дата в реестре"/>-->
<#--        </div>-->
<#--        <div class="form-group col-md-6">-->
<#--            <label class="control-label" for="docWorksId">Тип робіт</label>-->
<#--            <input type="text" name="docWorks" id="docWorksId" class="form-control" placeholder="Тип работ"/>-->
<#--        </div>-->
<#--        <div class="form-group col-lg-12">-->
<#--            <label class="control-label" for="docServiceId">Перелік робіт</label>-->
<#--            <input type="text" name="docService" id="docServiceId" class="form-control" placeholder="Работы" />-->
<#--        </div>-->
<#--        <div class="form-group col-md-6">-->
<#--            <label class="control-label" for="docMoneyId">Гроші числом</label>-->
<#--            <input type="number" name="docMoney" id="docMoneyId" class="form-control" placeholder="Деньги в цифрах" />-->
<#--        </div>-->
<#--        <div class="form-group col-md-6">-->
<#--            <label class="control-label" for="docMoneyUaId">Гроші літерами</label>-->
<#--            <input type="text" name="docMoneyUa" id="docMoneyUaId" class="form-control" placeholder="Деньги буквами"/>-->
<#--        </div>-->
<#--        <div class="form-group col-md-6">-->
<#--            <label class="control-label" for="fopPassportId">ФОП паспорт</label>-->
<#--            <input type="text" name="fopPassport" id="fopPassportId" class="form-control" placeholder="ФОП пасспорт"/>-->
<#--        </div>-->
<#--        <div class="form-group col-md-6">-->
<#--            <label class="control-label" for="fopPassportNumberId">Номер паспорту ФОП</label>-->
<#--            <input type="number" name="fopPassportNumber" id="fopPassportId" class="form-control" placeholder="ФОП номер пасспорта"/>-->
<#--        </div>-->
<#--        <div class="form-group col-md-6">-->
<#--            <label class="control-label" for="fopAddressId">Адреса ФОП</label>-->
<#--            <input type="text" name="fopAddress" id="fopAddressId" class="form-control" placeholder="ФОП адресс" />-->
<#--        </div>-->
<#--        <div class="form-group col-md-6">-->
<#--            <label class="control-label" for="fopMoneyNumberId">ФОП номер рахунку</label>-->
<#--            <input type="text" name="fopMoneyNumber" id="fopMoneyNumberId" class="form-control" placeholder="ФОП номер в банке"/>-->
<#--        </div>-->
<#--        <div class="form-group col-md-6">-->
<#--            <label class="control-label" for="fopTelephoneId">ФОП телефон</label>-->
<#--            <input type="text" name="fopTelephone" id="fopTelephoneId" class="form-control" placeholder="ФОП телефон"/>-->
<#--        </div>-->
<#--        <div class="form-group col-md-6">-->
<#--            <label class="control-label" for="fopCodeId">ФОП іден код</label>-->
<#--            <input type="text" name="fopCode" id="fopCodeId" class="form-control" placeholder="ФОП идент код" />-->
<#--        </div>-->
<#--        <input type="hidden" name="_csrf" value="${_csrf.token}"/>-->
<#--        <br><br>-->
<#--        <div class="btn-group btn-group-lg">-->
<#--            <button type="submit" class="btn btn-success">Save</button>-->
<#--            <button type="reset" class="btn btn-danger">Reset</button>-->
<#--        </div>-->
<#--    </>-->
<#--</form>-->

    <form action="/main/" method="get" role="form" class="form-horizontal">
        <div class="form-row">
      <#list fields as field>
<div class="form-group col-md-6">
    <label class="control-label">${field.fieldName}:</label>
<#--    <input type="text" name="fieldValue" id="fFieldValue" class="form-control" placeholder="Значение">-->
    <d>${field.fieldValue}</d>
<#--    <input type="hidden" name="_csrf" value="${_csrf.token}"/>-->
    <br><br>
</div>
            <#else>
            No fields!
        </#list>
            <button type="submit" class="btn btn-success btn-lg">Save</button>
        </div>
    </form>
<br><br>
<form action="/main/" method="post" role="form" class="form-horizontal">
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="fFieldName" class="control-label">Field name:</label>
            <input type="text" name="fieldName" id="fFieldName" class="form-control" placeholder="Enter field name">
<#--            <input type="text" name="docId" class="form-control" placeholder="Enter document"/>-->
            <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        </div>
        <br><br>
    </div>
    <button type="submit" class="btn btn-success btn-lg">Add</button>
</form>

</@c.page>
