package io.github.wechaty

import io.github.wechaty.filebox.FileBox
import io.github.wechaty.io.github.wechaty.schemas.EventEnum
import io.github.wechaty.schemas.*
import org.slf4j.LoggerFactory
import java.util.concurrent.Future

class MockPuppet(puppetOptions: PuppetOptions) : Puppet(puppetOptions) {
    override fun start(): Future<Void> {
        TODO("Not yet implemented")
        log.info("MockPuppet start()")

        //TODO("StateSwitch")
        /*
        if (this.state.on()) {
        log.warn('PuppetMock', 'start() is called on a ON puppet. await ready(on) and return.')
        await this.state.ready('on')
        return
        }

        this.state.on('pending')
        // await some tasks...
        this.state.on(true)
         */
        val eventScanPayload = EventScanPayload(ScanStatus.Cancel)
        eventScanPayload.qrcode = "https://github.com/wechaty/wechaty-puppet-mock"
        emit(EventEnum.SCAN, eventScanPayload)


    }

    override fun stop(): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun logout(): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun ding(data: String?) {
        TODO("Not yet implemented")
    }

    override fun contactSelfName(name: String): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun contactSelfQRCode(): Future<String> {
        TODO("Not yet implemented")
    }

    override fun contactSelfSignature(signature: String): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun tagContactAdd(tagId: String, contactId: String): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun tagContactDelete(tagId: String): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun tagContactList(contactId: String): Future<List<String>> {
        TODO("Not yet implemented")
    }

    override fun tagContactList(): Future<List<String>> {
        TODO("Not yet implemented")
    }

    override fun tagContactRemove(tagId: String, contactId: String): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun contactAlias(contactId: String): Future<String> {
        TODO("Not yet implemented")
    }

    override fun contactAlias(contactId: String, alias: String?): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun getContactAvatar(contactId: String): Future<FileBox> {
        TODO("Not yet implemented")
    }

    override fun setContactAvatar(contactId: String, file: FileBox): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun contactList(): Future<List<String>> {
        TODO("Not yet implemented")
    }

    override fun contactRawPayload(contractId: String): Future<ContactPayload> {
        TODO("Not yet implemented")
    }

    override fun contactRawPayloadParser(rawPayload: ContactPayload): Future<ContactPayload> {
        TODO("Not yet implemented")
    }

    override fun friendshipAccept(friendshipId: String): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun friendshipAdd(contractId: String, hello: String): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun friendshipSearchPhone(phone: String): Future<String?> {
        TODO("Not yet implemented")
    }

    override fun friendshipSearchWeixin(weixin: String): Future<String?> {
        TODO("Not yet implemented")
    }

    override fun friendshipRawPayload(friendshipId: String): Future<FriendshipPayload> {
        TODO("Not yet implemented")
    }

    override fun friendshipRawPayloadParser(rawPayload: FriendshipPayload): Future<FriendshipPayload> {
        TODO("Not yet implemented")
    }

    override fun messageContact(messageId: String): Future<String> {
        TODO("Not yet implemented")
    }

    override fun messageFile(messageId: String): Future<FileBox> {
        TODO("Not yet implemented")
    }

    override fun messageImage(messageId: String, imageType: ImageType): Future<FileBox> {
        TODO("Not yet implemented")
    }

    override fun messageMiniProgram(messageId: String): Future<MiniProgramPayload> {
        TODO("Not yet implemented")
    }

    override fun messageUrl(messageId: String): Future<UrlLinkPayload> {
        TODO("Not yet implemented")
    }

    override fun messageSendContact(conversationId: String, contactId: String): Future<String?> {
        TODO("Not yet implemented")
    }

    override fun messageSendFile(conversationId: String, file: FileBox): Future<String?> {
        TODO("Not yet implemented")
    }

    override fun messageSendMiniProgram(conversationId: String, miniProgramPayload: MiniProgramPayload): Future<String?> {
        TODO("Not yet implemented")
    }

    override fun messageSendText(conversationId: String, text: String, mentionList: List<String>?): Future<String?> {
        TODO("Not yet implemented")
    }

    override fun messageSendUrl(conversationId: String, urlLinkPayload: UrlLinkPayload): Future<String?> {
        TODO("Not yet implemented")
    }

    override fun messageRecall(messageId: String): Future<Boolean> {
        TODO("Not yet implemented")
    }

    override fun messageRawPayload(messageId: String): Future<MessagePayload> {
        TODO("Not yet implemented")
    }

    override fun messageRawPayloadParser(rawPayload: MessagePayload): Future<MessagePayload> {
        TODO("Not yet implemented")
    }

    override fun roomInvitationAccept(roomInvitation: String): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun roomInvitationRawPayload(roomInvitationId: String): Future<RoomInvitationPayload> {
        TODO("Not yet implemented")
    }

    override fun roomInvitationRawPayloadParser(rawPayload: RoomInvitationPayload): Future<RoomInvitationPayload> {
        TODO("Not yet implemented")
    }

    override fun roomAdd(roomId: String, contactId: String): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun roomAvatar(roomId: String): Future<FileBox> {
        TODO("Not yet implemented")
    }

    override fun roomCreate(contactIdList: List<String>, topic: String?): Future<String> {
        TODO("Not yet implemented")
    }

    override fun roomDel(roomId: String, contactId: String): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun roomList(): Future<List<String>> {
        TODO("Not yet implemented")
    }

    override fun roomQRCode(roomId: String): Future<String> {
        TODO("Not yet implemented")
    }

    override fun roomQuit(roomId: String): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun roomTopic(roomId: String): Future<String?>? {
        TODO("Not yet implemented")
    }

    override fun roomTopic(roomId: String, topic: String): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun roomRawPayload(roomId: String): Future<RoomPayload> {
        TODO("Not yet implemented")
    }

    override fun roomRawPayloadParser(roomPayload: RoomPayload): Future<RoomPayload> {
        TODO("Not yet implemented")
    }

    override fun getRoomAnnounce(roomId: String): Future<String> {
        TODO("Not yet implemented")
    }

    override fun setRoomAnnounce(roomId: String, text: String): Future<Void> {
        TODO("Not yet implemented")
    }

    override fun roomMemberList(roomId: String): Future<List<String>> {
        TODO("Not yet implemented")
    }

    override fun roomMemberRawPayload(roomId: String, contactId: String): Future<RoomMemberPayload> {
        TODO("Not yet implemented")
    }

    override fun roomMemberRawPayloadParser(rawPayload: RoomMemberPayload): Future<RoomMemberPayload> {
        TODO("Not yet implemented")
    }

    companion object {
        private val log = LoggerFactory.getLogger(MockPuppet::class.java)
    }
}