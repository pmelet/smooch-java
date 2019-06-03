/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.12
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Enums
 */

public class Enums {
  /**
   * Gets or Sets actionSize
   */
  public enum ActionSizeEnum {
    @SerializedName("compact")
    COMPACT("compact"),
    
    @SerializedName("full")
    FULL("full"),
    
    @SerializedName("tall")
    TALL("tall");

    private String value;

    ActionSizeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ActionSize")
  private ActionSizeEnum actionSize = null;

  /**
   * Gets or Sets actionType
   */
  public enum ActionTypeEnum {
    @SerializedName("buy")
    BUY("buy"),
    
    @SerializedName("link")
    LINK("link"),
    
    @SerializedName("locationRequest")
    LOCATIONREQUEST("locationRequest"),
    
    @SerializedName("postback")
    POSTBACK("postback"),
    
    @SerializedName("reply")
    REPLY("reply"),
    
    @SerializedName("share")
    SHARE("share"),
    
    @SerializedName("webview")
    WEBVIEW("webview");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ActionType")
  private ActionTypeEnum actionType = null;

  /**
   * Gets or Sets businessSystemType
   */
  public enum BusinessSystemTypeEnum {
    @SerializedName("helpscout")
    HELPSCOUT("helpscout"),
    
    @SerializedName("slack")
    SLACK("slack"),
    
    @SerializedName("zendesk")
    ZENDESK("zendesk");

    private String value;

    BusinessSystemTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("BusinessSystemType")
  private BusinessSystemTypeEnum businessSystemType = null;

  /**
   * Gets or Sets clientStatus
   */
  public enum ClientStatusEnum {
    @SerializedName("active")
    ACTIVE("active"),
    
    @SerializedName("blocked")
    BLOCKED("blocked"),
    
    @SerializedName("inactive")
    INACTIVE("inactive"),
    
    @SerializedName("pending")
    PENDING("pending");

    private String value;

    ClientStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ClientStatus")
  private ClientStatusEnum clientStatus = null;

  /**
   * Gets or Sets confirmationType
   */
  public enum ConfirmationTypeEnum {
    @SerializedName("immediate")
    IMMEDIATE("immediate"),
    
    @SerializedName("userActivity")
    USERACTIVITY("userActivity"),
    
    @SerializedName("prompt")
    PROMPT("prompt");

    private String value;

    ConfirmationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ConfirmationType")
  private ConfirmationTypeEnum confirmationType = null;

  /**
   * Gets or Sets conversationActivityType
   */
  public enum ConversationActivityTypeEnum {
    @SerializedName("conversation:read")
    CONVERSATION_READ("conversation:read"),
    
    @SerializedName("typing:start")
    TYPING_START("typing:start"),
    
    @SerializedName("typing:stop")
    TYPING_STOP("typing:stop");

    private String value;

    ConversationActivityTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ConversationActivityType")
  private ConversationActivityTypeEnum conversationActivityType = null;

  /**
   * Gets or Sets deploymentActivationMethod
   */
  public enum DeploymentActivationMethodEnum {
    @SerializedName("sms")
    SMS("sms"),
    
    @SerializedName("voice")
    VOICE("voice");

    private String value;

    DeploymentActivationMethodEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("DeploymentActivationMethod")
  private DeploymentActivationMethodEnum deploymentActivationMethod = null;

  /**
   * Gets or Sets deploymentHosting
   */
  public enum DeploymentHostingEnum {
    @SerializedName("self")
    SELF("self"),
    
    @SerializedName("smooch")
    SMOOCH("smooch");

    private String value;

    DeploymentHostingEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("DeploymentHosting")
  private DeploymentHostingEnum deploymentHosting = null;

  /**
   * Gets or Sets deploymentStatus
   */
  public enum DeploymentStatusEnum {
    @SerializedName("deleting")
    DELETING("deleting"),
    
    @SerializedName("error")
    ERROR("error"),
    
    @SerializedName("integrated")
    INTEGRATED("integrated"),
    
    @SerializedName("pending")
    PENDING("pending"),
    
    @SerializedName("registered")
    REGISTERED("registered"),
    
    @SerializedName("starting")
    STARTING("starting"),
    
    @SerializedName("unregistered")
    UNREGISTERED("unregistered");

    private String value;

    DeploymentStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("DeploymentStatus")
  private DeploymentStatusEnum deploymentStatus = null;

  /**
   * Gets or Sets imageAspectRatio
   */
  public enum ImageAspectRatioEnum {
    @SerializedName("horizontal")
    HORIZONTAL("horizontal"),
    
    @SerializedName("square")
    SQUARE("square");

    private String value;

    ImageAspectRatioEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ImageAspectRatio")
  private ImageAspectRatioEnum imageAspectRatio = null;

  /**
   * Gets or Sets integrationStatus
   */
  public enum IntegrationStatusEnum {
    @SerializedName("active")
    ACTIVE("active"),
    
    @SerializedName("inactive")
    INACTIVE("inactive"),
    
    @SerializedName("error")
    ERROR("error");

    private String value;

    IntegrationStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("IntegrationStatus")
  private IntegrationStatusEnum integrationStatus = null;

  /**
   * Gets or Sets integrationType
   */
  public enum IntegrationTypeEnum {
    @SerializedName("android")
    ANDROID("android"),
    
    @SerializedName("api")
    API("api"),
    
    @SerializedName("apn")
    APN("apn"),
    
    @SerializedName("fcm")
    FCM("fcm"),
    
    @SerializedName("ios")
    IOS("ios"),
    
    @SerializedName("line")
    LINE("line"),
    
    @SerializedName("mailgun")
    MAILGUN("mailgun"),
    
    @SerializedName("messagebird")
    MESSAGEBIRD("messagebird"),
    
    @SerializedName("messenger")
    MESSENGER("messenger"),
    
    @SerializedName("telegram")
    TELEGRAM("telegram"),
    
    @SerializedName("twilio")
    TWILIO("twilio"),
    
    @SerializedName("twitter")
    TWITTER("twitter"),
    
    @SerializedName("viber")
    VIBER("viber"),
    
    @SerializedName("web")
    WEB("web"),
    
    @SerializedName("wechat")
    WECHAT("wechat"),
    
    @SerializedName("whatsapp")
    WHATSAPP("whatsapp");

    private String value;

    IntegrationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("IntegrationType")
  private IntegrationTypeEnum integrationType = null;

  /**
   * Gets or Sets menuItemType
   */
  public enum MenuItemTypeEnum {
    @SerializedName("link")
    LINK("link"),
    
    @SerializedName("postback")
    POSTBACK("postback"),
    
    @SerializedName("submenu")
    SUBMENU("submenu");

    private String value;

    MenuItemTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("MenuItemType")
  private MenuItemTypeEnum menuItemType = null;

  /**
   * Gets or Sets messageItemSize
   */
  public enum MessageItemSizeEnum {
    @SerializedName("compact")
    COMPACT("compact"),
    
    @SerializedName("large")
    LARGE("large");

    private String value;

    MessageItemSizeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("MessageItemSize")
  private MessageItemSizeEnum messageItemSize = null;

  /**
   * Gets or Sets messageType
   */
  public enum MessageTypeEnum {
    @SerializedName("carousel")
    CAROUSEL("carousel"),
    
    @SerializedName("file")
    FILE("file"),
    
    @SerializedName("image")
    IMAGE("image"),
    
    @SerializedName("list")
    LIST("list"),
    
    @SerializedName("location")
    LOCATION("location"),
    
    @SerializedName("text")
    TEXT("text");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("MessageType")
  private MessageTypeEnum messageType = null;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    @SerializedName("appMaker")
    APPMAKER("appMaker"),
    
    @SerializedName("appUser")
    APPUSER("appUser");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("Role")
  private RoleEnum role = null;

  /**
   * Gets or Sets webhookTriggers
   */
  public enum WebhookTriggersEnum {
    @SerializedName("appUser:delete")
    APPUSER_DELETE("appUser:delete"),
    
    @SerializedName("client:add")
    CLIENT_ADD("client:add"),
    
    @SerializedName("client:remove")
    CLIENT_REMOVE("client:remove"),
    
    @SerializedName("conversation:read")
    CONVERSATION_READ("conversation:read"),
    
    @SerializedName("conversation:referral")
    CONVERSATION_REFERRAL("conversation:referral"),
    
    @SerializedName("link:failure")
    LINK_FAILURE("link:failure"),
    
    @SerializedName("link:match")
    LINK_MATCH("link:match"),
    
    @SerializedName("link:success")
    LINK_SUCCESS("link:success"),
    
    @SerializedName("merge:appUser")
    MERGE_APPUSER("merge:appUser"),
    
    @SerializedName("message:appMaker")
    MESSAGE_APPMAKER("message:appMaker"),
    
    @SerializedName("message:appUser")
    MESSAGE_APPUSER("message:appUser"),
    
    @SerializedName("message:delivery:channel")
    MESSAGE_DELIVERY_CHANNEL("message:delivery:channel"),
    
    @SerializedName("message:delivery:failure")
    MESSAGE_DELIVERY_FAILURE("message:delivery:failure"),
    
    @SerializedName("message:delivery:user")
    MESSAGE_DELIVERY_USER("message:delivery:user"),
    
    @SerializedName("payment:success")
    PAYMENT_SUCCESS("payment:success"),
    
    @SerializedName("postback")
    POSTBACK("postback"),
    
    @SerializedName("typing:appUser")
    TYPING_APPUSER("typing:appUser");

    private String value;

    WebhookTriggersEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("WebhookTriggers")
  private WebhookTriggersEnum webhookTriggers = null;

  public Enums actionSize(ActionSizeEnum actionSize) {
    this.actionSize = actionSize;
    return this;
  }

   /**
   * Get actionSize
   * @return actionSize
  **/
  @ApiModelProperty(value = "")
  public ActionSizeEnum getActionSize() {
    return actionSize;
  }

  public void setActionSize(ActionSizeEnum actionSize) {
    this.actionSize = actionSize;
  }

  public Enums actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Get actionType
   * @return actionType
  **/
  @ApiModelProperty(value = "")
  public ActionTypeEnum getActionType() {
    return actionType;
  }

  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  public Enums businessSystemType(BusinessSystemTypeEnum businessSystemType) {
    this.businessSystemType = businessSystemType;
    return this;
  }

   /**
   * Get businessSystemType
   * @return businessSystemType
  **/
  @ApiModelProperty(value = "")
  public BusinessSystemTypeEnum getBusinessSystemType() {
    return businessSystemType;
  }

  public void setBusinessSystemType(BusinessSystemTypeEnum businessSystemType) {
    this.businessSystemType = businessSystemType;
  }

  public Enums clientStatus(ClientStatusEnum clientStatus) {
    this.clientStatus = clientStatus;
    return this;
  }

   /**
   * Get clientStatus
   * @return clientStatus
  **/
  @ApiModelProperty(value = "")
  public ClientStatusEnum getClientStatus() {
    return clientStatus;
  }

  public void setClientStatus(ClientStatusEnum clientStatus) {
    this.clientStatus = clientStatus;
  }

  public Enums confirmationType(ConfirmationTypeEnum confirmationType) {
    this.confirmationType = confirmationType;
    return this;
  }

   /**
   * Get confirmationType
   * @return confirmationType
  **/
  @ApiModelProperty(value = "")
  public ConfirmationTypeEnum getConfirmationType() {
    return confirmationType;
  }

  public void setConfirmationType(ConfirmationTypeEnum confirmationType) {
    this.confirmationType = confirmationType;
  }

  public Enums conversationActivityType(ConversationActivityTypeEnum conversationActivityType) {
    this.conversationActivityType = conversationActivityType;
    return this;
  }

   /**
   * Get conversationActivityType
   * @return conversationActivityType
  **/
  @ApiModelProperty(value = "")
  public ConversationActivityTypeEnum getConversationActivityType() {
    return conversationActivityType;
  }

  public void setConversationActivityType(ConversationActivityTypeEnum conversationActivityType) {
    this.conversationActivityType = conversationActivityType;
  }

  public Enums deploymentActivationMethod(DeploymentActivationMethodEnum deploymentActivationMethod) {
    this.deploymentActivationMethod = deploymentActivationMethod;
    return this;
  }

   /**
   * Get deploymentActivationMethod
   * @return deploymentActivationMethod
  **/
  @ApiModelProperty(value = "")
  public DeploymentActivationMethodEnum getDeploymentActivationMethod() {
    return deploymentActivationMethod;
  }

  public void setDeploymentActivationMethod(DeploymentActivationMethodEnum deploymentActivationMethod) {
    this.deploymentActivationMethod = deploymentActivationMethod;
  }

  public Enums deploymentHosting(DeploymentHostingEnum deploymentHosting) {
    this.deploymentHosting = deploymentHosting;
    return this;
  }

   /**
   * Get deploymentHosting
   * @return deploymentHosting
  **/
  @ApiModelProperty(value = "")
  public DeploymentHostingEnum getDeploymentHosting() {
    return deploymentHosting;
  }

  public void setDeploymentHosting(DeploymentHostingEnum deploymentHosting) {
    this.deploymentHosting = deploymentHosting;
  }

  public Enums deploymentStatus(DeploymentStatusEnum deploymentStatus) {
    this.deploymentStatus = deploymentStatus;
    return this;
  }

   /**
   * Get deploymentStatus
   * @return deploymentStatus
  **/
  @ApiModelProperty(value = "")
  public DeploymentStatusEnum getDeploymentStatus() {
    return deploymentStatus;
  }

  public void setDeploymentStatus(DeploymentStatusEnum deploymentStatus) {
    this.deploymentStatus = deploymentStatus;
  }

  public Enums imageAspectRatio(ImageAspectRatioEnum imageAspectRatio) {
    this.imageAspectRatio = imageAspectRatio;
    return this;
  }

   /**
   * Get imageAspectRatio
   * @return imageAspectRatio
  **/
  @ApiModelProperty(value = "")
  public ImageAspectRatioEnum getImageAspectRatio() {
    return imageAspectRatio;
  }

  public void setImageAspectRatio(ImageAspectRatioEnum imageAspectRatio) {
    this.imageAspectRatio = imageAspectRatio;
  }

  public Enums integrationStatus(IntegrationStatusEnum integrationStatus) {
    this.integrationStatus = integrationStatus;
    return this;
  }

   /**
   * Get integrationStatus
   * @return integrationStatus
  **/
  @ApiModelProperty(value = "")
  public IntegrationStatusEnum getIntegrationStatus() {
    return integrationStatus;
  }

  public void setIntegrationStatus(IntegrationStatusEnum integrationStatus) {
    this.integrationStatus = integrationStatus;
  }

  public Enums integrationType(IntegrationTypeEnum integrationType) {
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Get integrationType
   * @return integrationType
  **/
  @ApiModelProperty(value = "")
  public IntegrationTypeEnum getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(IntegrationTypeEnum integrationType) {
    this.integrationType = integrationType;
  }

  public Enums menuItemType(MenuItemTypeEnum menuItemType) {
    this.menuItemType = menuItemType;
    return this;
  }

   /**
   * Get menuItemType
   * @return menuItemType
  **/
  @ApiModelProperty(value = "")
  public MenuItemTypeEnum getMenuItemType() {
    return menuItemType;
  }

  public void setMenuItemType(MenuItemTypeEnum menuItemType) {
    this.menuItemType = menuItemType;
  }

  public Enums messageItemSize(MessageItemSizeEnum messageItemSize) {
    this.messageItemSize = messageItemSize;
    return this;
  }

   /**
   * Get messageItemSize
   * @return messageItemSize
  **/
  @ApiModelProperty(value = "")
  public MessageItemSizeEnum getMessageItemSize() {
    return messageItemSize;
  }

  public void setMessageItemSize(MessageItemSizeEnum messageItemSize) {
    this.messageItemSize = messageItemSize;
  }

  public Enums messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Get messageType
   * @return messageType
  **/
  @ApiModelProperty(value = "")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  public Enums role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public Enums webhookTriggers(WebhookTriggersEnum webhookTriggers) {
    this.webhookTriggers = webhookTriggers;
    return this;
  }

   /**
   * Get webhookTriggers
   * @return webhookTriggers
  **/
  @ApiModelProperty(value = "")
  public WebhookTriggersEnum getWebhookTriggers() {
    return webhookTriggers;
  }

  public void setWebhookTriggers(WebhookTriggersEnum webhookTriggers) {
    this.webhookTriggers = webhookTriggers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Enums enums = (Enums) o;
    return Objects.equals(this.actionSize, enums.actionSize) &&
        Objects.equals(this.actionType, enums.actionType) &&
        Objects.equals(this.businessSystemType, enums.businessSystemType) &&
        Objects.equals(this.clientStatus, enums.clientStatus) &&
        Objects.equals(this.confirmationType, enums.confirmationType) &&
        Objects.equals(this.conversationActivityType, enums.conversationActivityType) &&
        Objects.equals(this.deploymentActivationMethod, enums.deploymentActivationMethod) &&
        Objects.equals(this.deploymentHosting, enums.deploymentHosting) &&
        Objects.equals(this.deploymentStatus, enums.deploymentStatus) &&
        Objects.equals(this.imageAspectRatio, enums.imageAspectRatio) &&
        Objects.equals(this.integrationStatus, enums.integrationStatus) &&
        Objects.equals(this.integrationType, enums.integrationType) &&
        Objects.equals(this.menuItemType, enums.menuItemType) &&
        Objects.equals(this.messageItemSize, enums.messageItemSize) &&
        Objects.equals(this.messageType, enums.messageType) &&
        Objects.equals(this.role, enums.role) &&
        Objects.equals(this.webhookTriggers, enums.webhookTriggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionSize, actionType, businessSystemType, clientStatus, confirmationType, conversationActivityType, deploymentActivationMethod, deploymentHosting, deploymentStatus, imageAspectRatio, integrationStatus, integrationType, menuItemType, messageItemSize, messageType, role, webhookTriggers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Enums {\n");
    
    sb.append("    actionSize: ").append(toIndentedString(actionSize)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    businessSystemType: ").append(toIndentedString(businessSystemType)).append("\n");
    sb.append("    clientStatus: ").append(toIndentedString(clientStatus)).append("\n");
    sb.append("    confirmationType: ").append(toIndentedString(confirmationType)).append("\n");
    sb.append("    conversationActivityType: ").append(toIndentedString(conversationActivityType)).append("\n");
    sb.append("    deploymentActivationMethod: ").append(toIndentedString(deploymentActivationMethod)).append("\n");
    sb.append("    deploymentHosting: ").append(toIndentedString(deploymentHosting)).append("\n");
    sb.append("    deploymentStatus: ").append(toIndentedString(deploymentStatus)).append("\n");
    sb.append("    imageAspectRatio: ").append(toIndentedString(imageAspectRatio)).append("\n");
    sb.append("    integrationStatus: ").append(toIndentedString(integrationStatus)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    menuItemType: ").append(toIndentedString(menuItemType)).append("\n");
    sb.append("    messageItemSize: ").append(toIndentedString(messageItemSize)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    webhookTriggers: ").append(toIndentedString(webhookTriggers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

